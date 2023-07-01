import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수 A와 B의 자리 수를 각각 배열에 저장한 후 모든 경우의 수를 계산
public class B1225_이상한_곱셈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A[] = new int[s[0].length()]; // A의 자리 수 저장
		int B[] = new int[s[1].length()]; // B의 자리 수 저장
		for (int i = 0; i < A.length; i++) { // input A[]
			A[i] = s[0].charAt(i) - '0';
		}
		for (int i = 0; i < B.length; i++) { // input B[]
			B[i] = s[1].charAt(i) - '0';
		}
		long ans = 0; // 모든 경우의 수 합
		for (int i = 0; i < A.length; i++) { // A 순회
			for (int j = 0; j < B.length; j++) { // B 순회
				ans += A[i] * B[j];
			}
		}
		System.out.println(ans); // 출력
		br.readLine();
	}
}