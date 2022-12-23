import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// for문으로 1부터 N까지 합 구하기
public class B5341_Pyramids {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOF
			int N = Integer.parseInt(s);
			int sum = 0; // 합
			for (int i = 1; i <= N; i++) { // 1부터 N까지 더하기
				sum += i;
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}