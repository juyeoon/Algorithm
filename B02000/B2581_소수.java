import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// M 이상 N 이하의 자연수 중 소수인 것들의 합과 최솟값을 찾기
// 1부터 N까지 에라토스테네스의 체로 소수 구하기
// M부터 N까지 소수를 확인하고 처음 나오는 소수를 최솟값으로 설정. 소수가 나올때마다 합에 더하기
// 최솟값을 설정 안 하면 사이에 소수가 없는 것
public class B2581_소수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine()); // M 이상
		int N = Integer.parseInt(br.readLine()); // N 이하
		boolean notPrime[] = new boolean[N + 1]; // 소수 여부 (N까지) (true: 소수가 아님)
		if (N < 2) { // 2 이하면 사이의 소수가 없음
			sb.append(-1);
		} else {
			notPrime[0] = notPrime[1] = true; // 0과 1은 소수가 아님
			for (int i = 2; i <= Math.sqrt(N); i++) { // 2부터 N의 제곱근까지 각 수의 배수를 체크
				if (notPrime[i]) { // 이미 판정이 되면 다른 수로 (ex. 4는 2의 배수기 때문에 4의 배수는 다 체크됨)
					continue;
				}
				for (int j = i * i; j < notPrime.length; j += i) { // 배수를 소수가 아닌걸로 체크
					notPrime[j] = true;
				}
			}
			int sum = 0; // 소수의 합
			int min = -1; // 소수 최솟값
			for (int i = M; i <= N; i++) { // M부터 N까지 확인
				if (!notPrime[i]) { // 소수면
					if (min == -1) { // 최초의 소수가 아직 안 나왔으면
						min = i; // 최솟값 설정
					}
					sum += i; // 합 구하기
				}
			}
			if (min == -1) { // 최솟값이 설정이 안 됐으면 사이에 소수가 없는 것
				sb.append(-1);
			} else { // 사이에 소수가 있으면
				sb.append(sum).append("\n").append(min); // 출력 저장
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}