import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/9306
// 각 테스트 케이스마다 두 줄씩 입력 받고 출력 형식에 맞게 출력
public class B9306_Practice_Roll_Call {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Case ").append(tc).append(": "); // 출력 형식 맞추기
			String firstName = br.readLine(); // 이름
			String lastName = br.readLine(); // 성
			sb.append(lastName).append(", ").append(firstName).append("\n"); // 이름 순서에 맞게 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
