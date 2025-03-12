import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가로 세로 길이로 각각의 면적을 구한 후 더 큰 곳 출력
public class B16099_Larger_Sport_Facility {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			String s[] = br.readLine().split(" ");
			long lt = Long.parseLong(s[0]); // TelecomParisTech 세로
			long wt = Long.parseLong(s[1]); // TelecomParisTech 가로
			long le = Long.parseLong(s[2]); // Eurecom 세로
			long we = Long.parseLong(s[3]); // Eurecom 가로
			long t = lt * wt; // TelecomParisTech 면적
			long e = le * we; // Eurecom 면적
			if (t > e) { // 더 큰 면적 출력
				sb.append("TelecomParisTech\n");
			} else if (t < e) {
				sb.append("Eurecom\n");
			} else { // 면적이 같음
				sb.append("Tie\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}