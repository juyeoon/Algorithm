import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 홀짝 구분 => n0 * 3의 홀짝은 n0의 홀짝과 같음
// n4 => n0 / 2(짝수), (n0 - 1) / 2(홀수)
public class B4892_숫자_맞추기_게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		int tc = 0; // 출력용 테스트케이스
		while (!(s = br.readLine()).equals("0")) { // EOF
			int n0 = Integer.parseInt(s); // n0
			sb.append(++tc).append(". "); // 테스트케이스 출력
			if (n0 % 2 == 0) { // 짝수
				sb.append("even ").append(n0 / 2).append("\n");
			} else { // 홀수
				sb.append("odd ").append((n0 - 1) / 2).append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}