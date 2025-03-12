import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A를 B로 나누었을 때 나머지가 0이면 배수, 0이 아니면 배수가 아님
public class B4504_배수_찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 나누는 수(n의 배수인지 확인)
		String s = "";
		while (!(s = br.readLine()).equals("0")) {
			int tmp = Integer.parseInt(s); // 나누어지는 수
			sb.append(s).append(" is").append((tmp % n == 0) ? "" : " NOT");
			sb.append(" a multiple of ").append(n).append(".\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}