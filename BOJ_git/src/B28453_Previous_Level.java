import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// if - else if로 조건 분기
public class B28453_Previous_Level {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 레벨 개수
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			int level = Integer.parseInt(s[i]); // 레벨 값
			if (level >= 300) { // 만렙
				sb.append("1 ");
			} else if (level >= 275) { // 구만렙 ~ 만렙
				sb.append("2 ");
			} else if (level >= 250) { // 뀨만렙 ~ 구만렙
				sb.append("3 ");
			} else { // ~ 뀨만렙
				sb.append("4 ");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}