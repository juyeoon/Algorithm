import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력이 %2==0이면 짝수
// 짝수면 합에 더하기, 최솟값 갱신
public class B3058_짝수를_찾아라 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 0; tc < T; tc++) {
			int sum = 0; // 짝수 합
			int min = Integer.MAX_VALUE; // 최소 짝수
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 7; i++) { // 7명
				int num = Integer.parseInt(st.nextToken());
				if (num % 2 == 0) { // 짝수이면
					sum += num; // 합 갱신
					min = Math.min(num, min); // 최솟값 갱신
				}
			}
			sb.append(sum).append(" ").append(min).append("\n"); // sb에 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
