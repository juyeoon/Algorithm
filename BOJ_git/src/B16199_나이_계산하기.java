import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 만 나이: 기준 연도 - 생일 연도 + (달, 날짜 지남:-1, 안 지남: 0)
// 세는 나이: 기준 연도 - 생일 연도 + 1
// 연 나이: 기준 연도 - 생일 연도
public class B16199_나이_계산하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int bir[] = new int[3]; // 생일
		int refd[] = new int[3]; // 기준 날짜
		for (int i = 0; i < 3; i++) { // input bir[]
			bir[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++) { // input refd[]
			refd[i] = Integer.parseInt(st.nextToken());
		}
		// 1. 만 나이
		int man = refd[0] - bir[0]; // 기준 연도 - 생일 연도
		// 달, 날짜 지남:-1, 안 지남: 0 // 달 날짜를 지났는지 확인하기 위해서 (달 *100+날짜)로 확인
		man += (bir[1] * 100 + bir[2]) > (refd[1] * 100 + refd[2]) ? -1 : 0;
		sb.append(man).append("\n");
		// 2. 세는 나이
		sb.append(refd[0] - bir[0] + 1).append("\n"); // 기준 연도 - 생일 연도 + 1
		// 3. 연 나이
		sb.append(refd[0] - bir[0]).append("\n"); // 기준 연도 - 생일 연도
		System.out.println(sb); // 출력
		br.close();

	}
}