import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/33631
// 배열 s는 현재 재료 상태, 배열 n은 쿠키 1개당 필요한 재료 양을 저장
// 쿼리 번호 1번: 쿠키를 만들 수 있는지 재료별 최소 가능 수량으로 판단하고, 만들 수 있으면 최소 수량만큼 재료 차감 및 만든 쿠키 개수 증가
// 쿼리 번호 2~5: 각각 밀가루, 초콜릿, 달걀, 버터를 추가하는 동작으로 index를 맞춰 값을 더하고 출력
public class B33631_1교시_가정 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] s = new int[4]; // 현재 가지고 있는 재료 배열: 밀가루, 초콜릿, 달걀, 버터
		for (int i = 0; i < 4; i++) { // s[] 입력
			s[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int[] n = new int[4]; // 쿠키 1개 만들 때 필요한 재료 배열
		for (int i = 0; i < 4; i++) { // n[] 입력
			n[i] = Integer.parseInt(st.nextToken());
		}
		int Q = Integer.parseInt(br.readLine()); // 쿼리 수
		int cookie = 0; // 현재까지 만든 쿠키 수
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			int no = Integer.parseInt(st.nextToken()); // 쿼리 번호
			int amount = Integer.parseInt(st.nextToken()); // 쿼리 대상 양
			if (no == 1) { // 쿠키 만들기 쿼리인 경우
				int min = Integer.MAX_VALUE; // 만들 수 있는 최대 쿠키 수
				for (int j = 0; j < 4; j++) { // 각 재료별로 가능한 수량의 최솟값 계산
					min = Math.min(s[j] / n[j], min);
				}
				if (min >= amount) { // 요청한 수량만큼 만들 수 있는 경우
					cookie += amount; // 누적 쿠키 개수 증가
					for (int j = 0; j < 4; j++) { // 재료 차감
						s[j] -= n[j] * amount;
					}
					sb.append(cookie); // 결과에 현재 쿠키 개수 출력 저장
				} else {
					sb.append("Hello, siumii"); // 재료 부족 시 메시지 출력 저장
				}
			} else {
				s[no - 2] += amount; // no: 2~5 → 밀가루~버터 → 인덱스는 no - 2
				sb.append(s[no - 2]); // 현재 재료 양 출력 저장
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
