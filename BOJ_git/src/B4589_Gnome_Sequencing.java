import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 받은 세 수가 오름차순 정렬이거나 내림차순 정렬이면 Ordered
// 그 외에는 Unordered 출력
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 그룹 수
		sb.append("Gnomes:\n");
		for (int i = 0; i < N; i++) {
			String s[] = br.readLine().split(" ");
			if (Integer.parseInt(s[0]) < Integer.parseInt(s[1])) { 
				if (Integer.parseInt(s[1]) < Integer.parseInt(s[2])) { // 오름차순
					sb.append("Ordered\n");
					continue;
				}
			} else {
				if (Integer.parseInt(s[1]) > Integer.parseInt(s[2])) { // 내림차순
					sb.append("Ordered\n");
					continue;
				}
			}
			sb.append("Unordered\n"); // 그 외
		}
		System.out.println(sb); // 출력
		br.close();
	}
}