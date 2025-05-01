import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25278
// 환경이 변했을 때 거주 조건을 충족하는지 확인하는 문제
// 바다, 산소, 온도에 대해 초기값을 성정하고 변화값을 입력받아 수정
// 변화가 끝난 상태에서 거주 가능한 조건에 만족하는지 확인 후 결과에 따라 출력
public class B25278_Terraforming {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 변화의 개수
		int ocean = 0; // 바다 비율
		int oxygen = 0; // 산소 농도
		int temperature = -30; // 온도
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String parameter = st.nextToken(); // 환경 종류
			int change = Integer.parseInt(st.nextToken().replace("+", "")); // 변화값
			switch (parameter) {
			case "ocean": // 바다
				ocean += change;
				break;
			case "oxygen": // 산소
				oxygen += change;
				break;
			case "temperature": // 온도
				temperature += change;
				break;
			}
		}
		if (ocean >= 9 && oxygen >= 14 && temperature >= 8) { // 거주 조건 충족
			System.out.println("liveable");
		} else { // 거주 조건 미충족
			System.out.println("not liveable");
		}
		br.close();
	}
}
