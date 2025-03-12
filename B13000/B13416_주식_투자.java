import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 각 날의 최댓값을 구한 후 최댓값이 양수면 하나의 테스트케이스의 최대 이익값에 더한 후 총 합을 출력
public class B13416_주식_투자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 주식 데이터의 일수
			int sum = 0; // 각 날의 최대 손익의 합(최대 이익)
			for (int i = 0; i < N; i++) { //
				int max = Integer.MIN_VALUE; // 그날의 최대 이익
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 3; j++) { // 최대 이익 구하기
					max = Math.max(max, Integer.parseInt(st.nextToken()));
				}
				if (max > 0) { // 최대 이익이 음수면 아무 회사도 구매 X
					sum += max; // 최대 이익 갱신
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}