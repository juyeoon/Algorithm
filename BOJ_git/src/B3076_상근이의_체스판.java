import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// for 반복문으로 검은색 칸으로 시작하는 행의 문자 배열과 흰색 칸으로 시작하는 행의 문자 배열을 먼저 String에 저장 후
// 같은 형태로 조건에 맞게 문자열을 반복 출력하여 전체 체스 패턴 구하기
public class B3076_상근이의_체스판 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken()); // 체스판 행
		int C = Integer.parseInt(st.nextToken()); // 체스판 열
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()); // 한 칸의 높이
		int B = Integer.parseInt(st.nextToken()); // 한 칸의 너비
		String black = ""; // 검은색 칸으로 시작하는 한 행의 문자 배열
		String white = ""; // 흰색 칸으로 시작하는 한 행의 문자 배열
		// 체스판의 한 행의 패턴 구하기
		for (int j = 0; j < C / 2; j++) { // black에는 '검흰', white에는 '흰검' 패턴 반복
			for (int i = 0; i < B; i++) { // 한 칸의 '검'(black), '흰'(whilte) 패턴 구하기
				black += 'X';
				white += '.';
			}
			for (int i = 0; i < B; i++) { // 한 칸의 '흰'(black), '검'(white) 패턴 구하기
				black += '.';
				white += 'X';
			}
		}
		if (C % 2 == 1) { // C가 홀수면 한 칸 추가 필요
			for (int i = 0; i < B; i++) { // 한 칸의 '검'(black), '흰'(whilte) 패턴 구하기
				black += 'X';
				white += '.';
			}
		}
		black += "\n"; // 개행 문자 추가
		white += "\n"; // 개행 문자 추가
		// 체스판 전체 패턴 구하기
		for (int j = 0; j < R / 2; j++) { // 체스판 행의 '검흰' 패턴 반복
			for (int i = 0; i < A; i++) {
				sb.append(black);
			}
			for (int i = 0; i < A; i++) {
				sb.append(white);
			}
		}
		if (R % 2 == 1) { // R이 홀수면 검은색으로 시작하는 패턴 추가 필요
			for (int i = 0; i < A; i++) {
				sb.append(black);
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}