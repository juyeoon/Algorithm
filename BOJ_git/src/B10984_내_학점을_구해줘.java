import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 총 학점 = 학점 모두 더하기
// 총 점수(GPA) = (학점*점수)의 합/총 학점
public class B10984_내_학점을_구해줘 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 과목 개수
			int creditSum = 0; // 총 학점
			double GPA = 0; // 총 점수
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int credit = Integer.parseInt(st.nextToken()); // 학점
				double score = Double.parseDouble(st.nextToken()); // 점수
				creditSum += credit; // 총 학점에 더하기
				GPA += credit * score; // 총 점수에 더하기
			}
			GPA /= creditSum; // 총 점수를 총 학점으로 나누기
			sb.append(creditSum).append(" ").append(String.format("%.1f", GPA)).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}