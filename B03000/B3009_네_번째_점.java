import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// x좌표, y좌표 각각 세 점의 좌표 중 다른 하나의 조합이 답
public class B3009_네_번째_점 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int one[] = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) }; // 첫 번째 점
		st = new StringTokenizer(br.readLine());
		int two[] = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) }; // 두 번째 점
		st = new StringTokenizer(br.readLine());
		int three[] = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) }; // 세 번째 점
		// x좌표 확인
		if (one[0] == two[0]) {
			sb.append(three[0]);
		} else if (one[0] == three[0]) {
			sb.append(two[0]);
		} else {
			sb.append(one[0]);
		}
		sb.append(" ");
		// y좌표 확인
		if (one[1] == two[1]) {
			sb.append(three[1]);
		} else if (one[1] == three[1]) {
			sb.append(two[1]);
		} else {
			sb.append(one[1]);
		}
		System.out.println(sb); // 출력
		br.close();
	}
}