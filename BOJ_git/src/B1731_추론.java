import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 공차와 공비를 동시에 계산하여 이전 공차와 현재 공차가 다르면 공비수열, 이전 공비와 현재 공비가 다르면 공차수열
// 공비를 계산에서 나누기에 나머지가 있으면 공비수열이 아님 => 공차수열
public class B1731_추론 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 수열의 길이, 항의 개수
		long a1 = Integer.parseInt(br.readLine()); // 첫번째 항
		int pre = Integer.parseInt(br.readLine()); // 이전 항(초기값: 두번째 항)
		boolean arithmetic = false; // 등차수열, 등비수열 구분(true: 등차, false: 등비)
		long d = pre - a1; // 공차
		long r = pre / a1; // 공비
		if (pre % a1 != 0) { // 공비가 정수가 아니면 등차수열
			arithmetic = true;
		} else {
			for (int i = 2; i < N; i++) { // 등차수열인지 등비수열인지 확인
				int num = Integer.parseInt(br.readLine()); // 현재 항
				if (num % pre != 0) { // 현재항과 이전항의 공비가 정수가 아니면 등차수열
					arithmetic = true;
					break;
				}
				if (d != num - pre) { // 현재항과 이전항의 공차가 이전에 계산한 공차와 같지 않으면 등비수열
					arithmetic = false;
					break;
				}
				if (r != num / pre) { // 현재항과 이전항의 공비가 이전에 계산한 공비와 같지 않으면 등차수열
					arithmetic = true;
					break;
				}
				d = num - pre; // 등차 갱신
				r = num / pre; // 등비 갱신
				pre = num; // 이전항 갱신
			}
		}
		if (arithmetic) { // 등차수열일 때
			System.out.println(a1 + d * N); // N+1번째 항 출력
		} else { // 등비수열일 때
			System.out.println(a1 * (long) Math.pow(r, N)); // N+1번째 항 출력
		}
		br.close();
	}
}