import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 나이 > 17 || 몸무게 >= 80이면 성인부
// 그 외에는 청소년부
public class B2083_럭비_클럽 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("# 0 0")) { // 마지막 줄이 들어올 때까지 반복
			st = new StringTokenizer(s);
			sb.append(st.nextToken()).append(" "); // 이름 입력
			if (Integer.parseInt(st.nextToken()) > 17 || Integer.parseInt(st.nextToken()) >= 80) { // 성인부이면
				sb.append("Senior\n"); // Senior 입력
				continue; // 다음 줄로
			}
			sb.append("Junior\n"); // 그 외에는 Junior 입력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}