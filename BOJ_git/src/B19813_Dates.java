import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// indexOf()로 어떤 구분자가 있는지 확인
// 구분자에 따라서 일, 월, 연도(정수)로 저장
// String.format("%02d")로 일, 월을 2자리로 맞추기
// String.format("%04d")로 연도를 4자리로 맞추기
// 출력 형식에 맞춰 변수 저장
public class B19813_Dates {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 입력 라인 개수
		for (int i = 0; i < n; i++) {
			String s = br.readLine(); // 입력 문자열
			StringTokenizer st = null;
			int d = 0; // 일
			int m = 0; // 월
			int y = 0; // 연도
			if (s.indexOf(".") != -1) { // '.'으로 구분
				st = new StringTokenizer(s, ".");
				d = Integer.parseInt(st.nextToken());
				m = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
			} else { // '/'으로 구분
				st = new StringTokenizer(s, "/");
				m = Integer.parseInt(st.nextToken());
				d = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
			}
			// 앞을 0으로 채우기
			String day = String.format("%02d", d);
			String month = String.format("%02d", m);
			String year = String.format("%04d", y);
			// 출력 형식 맞추기
			sb.append(day).append(".").append(month).append(".").append(year).append(" ");
			sb.append(month).append("/").append(day).append("/").append(year).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}