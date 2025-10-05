import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34400
// t시간 30분 후에 민규가 깨어있을지 자고 있을지 판단
// t를 25로 나눈 나머지로 바꾼 후, t가 16이하 (16시 30분)면 깨어 있고, 17이상 (17시 30분)이면 자고 있음
public class B34400_민규의_서카디안_리듬 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			int t = Integer.parseInt(br.readLine()); // 연락하는 시간
			t %= 25; // 25시간 주기
			sb.append((t < 17) ? "ONLINE" : "OFFLINE").append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
