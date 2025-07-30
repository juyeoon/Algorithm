import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/30889
// boolean 2차원 배열에 좌석 자리를 저장
// 행 번호 : 맨 앞의 알파벳(문자)를 정수로 바꿈 (A: 0)
// 열 번호 : 맨 앞의 문자를 제외한 문자열을 정수로 바꿈 (1: 0)
// StringBuilder에 boolean 2차원 배열의 정보를 저장하여 출력 (true: "o", false: ".")
public class B30889_좌석_배치도 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[][] seat = new boolean[10][20]; // 상영관 자리
		int N = Integer.parseInt(br.readLine()); // 좌석 수
		for (int i = 0; i < N; i++) {
			String s = br.readLine(); // 좌석 번호
			int row = s.charAt(0) - 'A'; // 행 번호
			int col = Integer.parseInt(s.substring(1)) - 1; // 열 번호
			seat[row][col] = true; // 좌석 체크
		}
		// 출력 저장
		for (boolean[] bs : seat) {
			for (boolean bs2 : bs) {
				sb.append(bs2 ? "o" : ".");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
