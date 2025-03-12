import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11557_Yangjojang_of_The_Year {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 학교 수
			String maxS = ""; // 최대 소비 술의 양을 가지는 학교 이름
			int maxL = -1; // 최대 소비 술의 양
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				String S = st.nextToken(); // 학교 이름
				int L = Integer.parseInt(st.nextToken()); // 소비 술의 양
				if (L > maxL) { // 소비 술의 양이 기존 최댓값보다 클 때
					maxL = L; // 최댓값 갱신
					maxS = S; // 최대 학교 갱신
				}
			}
			sb.append(maxS).append("\n"); // 최대값을 가지는 학교 이름 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}