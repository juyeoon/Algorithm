import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1번 방법
// 등차수열 합공식(n*(n+1)/2)를 이용하여 N보다 큰 합을 가지는 수(std)를 찾고 그 값을 N에서 빼기 & 카운트에 std 더하기 => N이 0보다 클 때만 반복
// 2번 방법
// N을 1(idx)부터 빼가고 N에서 idx를 뺀 값이 양의 정수가 아니면 idx를 1로 바꾸어 빼기 => => N이 0보다 클 때만 반복
// 두 방법의 수행 시간 차이는 거의 없음
public class B1568_새 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 새의 수
		
//		i) 1번 방법
//		int cnt = 0; // 모든 새가 날아가기까지 걸린 시간(카운트)
//		while (N > 0) {
//			int std = (int) Math.sqrt(N * 2); // N보다 큰 합을 가지는 수
//			// std 크기 조절 // N보다 작거나 같은 최대의 std 찾기
//			while (std * (std + 1) / 2 < N) { // std의 합이 N보다 커질 때까지
//				std++;
//			}
//			if (std * (std + 1) / 2 > N) { // N보다 작거나 같은 최대의 std 찾기
//				std--;
//			}
//			//
//			N -= std * (std + 1) / 2; // N에 std의 합 빼기
//			cnt += std; // 카운트에 횟수 더하기
//		}
//		System.out.println(cnt); // 총 카운트 출력

//		ii) 2번 방법
		int idx = 1; // N에서 뺄 값 (날아가는 새의 수)
		int cnt = 0; // 모든 새가 날아가기까지 걸린 시간(카운트)
		while (N > 0) {
			if (N - idx < 0) { // 뺐을 때 음수가 되면
				idx = 1; // 다시 1마리부터 날리기
			}
			N -= idx++; // N에서 빼기 & idx 갱신
			cnt++; // 총 카운트 갱신
		}
		System.out.println(cnt); // 총 카운트 출력
		br.readLine();
	}
}