import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연도의 최소는 1, 최댓값은 지구, 태양, 달의 주기의 최소공배수 7980
// 연도 = 태양 + x * 28 && 연도 = 달 + y * 19 && 연도 = 지구 + k * 15이어야 함
// => (연도 - (태양, 달, 지구))%해당 주기 == 0이 모두 만족해야 함
public class B1476_날짜_계산 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int E = Integer.parseInt(st.nextToken()); // 지구
		int S = Integer.parseInt(st.nextToken()); // 태양
		int M = Integer.parseInt(st.nextToken()); // 달
		int i = 1; // 우리가 알고 있는 연도
		while (i <= 7980) { // 세 주기 15, 28, 19의 최소공배수
			if ((i - S) % 28 != 0) { // 태양
				i++;
				continue;
			}
			if ((i - M) % 19 != 0) { // 달
				i++;
				continue;
			}
			if ((i - E) % 15 != 0) { // 지구
				i++;
				continue;
			}
			break; // 위에서 모든 안 되는 조건을 피하면 현재 값이 정답
		}
		System.out.println(i); // 출력
		br.close();
	}
}
