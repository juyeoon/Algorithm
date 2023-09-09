import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 양념 1마리 + 후라이드 1마리 = 반반 2개 
// 1) 양념 개수(X)와 후라이드 개수(Y)중 최솟값(min) 만큼 (양념 1마리 + 후라이드 1마리)와 (반반 2개)의 가격을 비교한 후 최솟값으로 가격을 구함
// 2) X-min에 양념 한마리 가격(A)와 반반 가격(C)*2 중 최솟값을 곱하여 양념 치킨 남은 개수 계산
// 3) Y-min에 후라이드 한마리 가격(B)와 C*2 중 최솟값을 곱하여 후라이드 치킨 남은 개수 계산
// 4) 총 합 출력
public class B16917_양념_반_후라이드_반 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // 양념 1마리 가격
		int B = Integer.parseInt(s[1]); // 후라이드 1마리 가격
		int C = Integer.parseInt(s[2]); // 반반 1개 가격
		int X = Integer.parseInt(s[3]); // 양념 치킨 필요 개수
		int Y = Integer.parseInt(s[4]); // 후라이드 치킨 필요 개수
		int min = Math.min(X, Y); // 치킨 필요 개수 최솟값
		int ans = 0; // 치킨 구매 최소 금액
		if (A + B >= C * 2) { // 1)
			ans += C * 2 * min;
		} else {
			ans += A * min;
			ans += B * min;
		}
		X -= min; // 2)
		ans += Math.min(X * A, X * C * 2);
		Y -= min; // 3)
		ans += Math.min(Y * B, Y * C * 2);
		System.out.println(ans); // 4)
		br.close();
	}
}