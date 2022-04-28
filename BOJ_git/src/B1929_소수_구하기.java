import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//N의 제곱근만큼 반복하면서(돌면서) 소수인지 확인
public class B1929_소수_구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] s = br.readLine().split(" ");
		int M = Integer.parseInt(s[0]); // 시작값
		int N = Integer.parseInt(s[1]); // 끝값
		boolean[] prime = new boolean[N + 1]; // 합성수: true, 소수: false
		prime[0] = prime[1] = true; // 0과 1은 소수가 아님
		if (N >= 2) { // 소수 확인
			for (int i = 2; i <= Math.sqrt(N); i++) {
				if (prime[i] == true) {
					continue;
				}
				for (int j = i * i; j < prime.length; j = j + i) {
					prime[j] = true; // i의 배수 true 처리
				}
			}
		}
		for (int i = M; i <= N; i++) { // 출력 => false인것만
			if (prime[i] == false) {
				sb.append(i).append("\n");
			}
		}

		System.out.println(sb);
		br.close();
	}
}
