import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 버전의 총 시간 중 짧은 버전을 사용하는 것이 좋음
// 직렬 버전 총 실행 시간 = 프로그램 실행 횟수 * 직렬 실행 시간
// 병렬 버전 총 실행 시간  = 병렬 개발 시간 + 프로그램 실행 횟수 * 병렬 실행 시간
public class B11109_괴짜_교수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int d = Integer.parseInt(st.nextToken()); // 병렬 버전 개발 시간
			int n = Integer.parseInt(st.nextToken()); // 프로그램 실행 횟수
			int s = Integer.parseInt(st.nextToken()); // 직렬 버전 실행 시간
			int p = Integer.parseInt(st.nextToken()); // 병렬 버전 실행 시간
			int series = s * n; // 직렬 총 시간
			int parallel = d + p * n; // 병렬 총 시간
			if (series > parallel) { // 병렬이 더 빠르면
				sb.append("parallelize");
			} else if (series < parallel) { // 직렬이 더 빠르면
				sb.append("do not parallelize");
			} else { // 시간이 같으면
				sb.append("does not matter");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}