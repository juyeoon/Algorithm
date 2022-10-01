import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 영식: (시간 / 30초 + 1(나머지)) * 10원
// 민식: (시간 / 60초 + 1(나머지)) * 15원
public class B1267_핸드폰_요금 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 통화의 개수
		String s[] = br.readLine().split(" ");
		int Y = 0;
		int M = 0;
		for (int i = 0; i < N; i++) {
			int time = Integer.parseInt(s[i]); // 시간
			Y += (time / 30 + 1) * 10; // Y(영식)
			M += (time / 60 + 1) * 15; // M(민식)
		}
		if (M < Y) { // 민식이 더 적음
			sb.append("M ").append(M);
		} else if (M > Y) { // 영식이 더 적음
			sb.append("Y ").append(Y);
		} else { // 같음
			sb.append("Y M ").append(Y);
		}
		System.out.println(sb); // 출력
		br.close();
	}
}