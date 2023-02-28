import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 세트 X와 세트 Y가 N개를 만족할 때 최솟값을 구하는 문제
public class B15474_鉛筆_Pencils {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 필요한 연필 개수
		int A = Integer.parseInt(s[1]); // 세트 X의 연필 개수
		int B = Integer.parseInt(s[2]); // 세트 X의 가격
		int C = Integer.parseInt(s[3]); // 세트 Y의 연필 개수
		int D = Integer.parseInt(s[4]); // 세트 Y의 가격
		int X = N / A * B + (N % A == 0 ? 0 : B); // 연필 개수가 N개 이상이 되는 세트 X의 구매 최솟값
		int Y = N / C * D + (N % C == 0 ? 0 : D); // 연필 개수가 N개 이상이 되는 세트 Y의 구매 최솟값
		System.out.println(Math.min(X, Y)); // 최솟값 출력
		br.close();
	}
}