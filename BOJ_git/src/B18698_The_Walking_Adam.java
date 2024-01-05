import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B18698_The_Walking_Adam {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			String s = br.readLine(); // 입력값
			int cnt = 0; // 넘어지기 전까지 걸은 횟수
			for (int i = 0; i < s.length(); i++) { // 입력값 문자 순회
				if (s.charAt(i) == 'D') { // 넘어졌을 때
					break; // 반복문 탈출
				}
				cnt++; // 걸은 횟수 추가
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}