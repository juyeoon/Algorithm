import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그리디 -> 최대 단위부터 빼기
public class B11047_동전_0 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 돈 단위 종류 개수
		int K = Integer.parseInt(s[1]); // 금액
		int v[] = new int[N]; // 돈 단위 저장
		for (int i = 0; i < N; i++) { // input v[]
			v[i] = Integer.parseInt(br.readLine());
		}
		int result = 0; // 최소 개수
		for (int i = N - 1; i >= 0; i--) {
			int cnt = K / v[i]; // 화폐 단위 하나 사용 개수
			K -= cnt * v[i]; // 사용하는 금액만큼 빼기
			result += cnt; // 화폐 단위 하나 사용량 결과에 더하기
		}
		System.out.println(result); // 출력
		br.close();
	}
}
