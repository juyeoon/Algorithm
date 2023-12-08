import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이중 for문으로 입력값을 문자 단위로 끊은 후 switch-case문으로 문자에 따른 점수 계산
// 백의 기물 점수 합 - 흑의 기물 점수 합 출력
public class B29725_체스_초보_브실이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int white = 0; // 백의 기물 점수 합
		int black = 0; // 흑의 기물 점수 합 출력
		for (int i = 0; i < 8; i++) { // 행 (라인 단위)
			String s = br.readLine();
			for (int j = 0; j < 8; j++) { // 열 (문자 단위)
				switch (s.charAt(j)) {
				case 'P': // 백 폰
					++white;
					break;
				case 'N': // 백 나이트
					white += 3;
					break;
				case 'B': // 백 비숍
					white += 3;
					break;
				case 'R': // 백 룩
					white += 5;
					break;
				case 'Q': // 백 퀸
					white += 9;
					break;
				case 'p': // 흑 폰
					++black;
					break;
				case 'n': // 흑 나이트
					black += 3;
					break;
				case 'b': // 흑 비숍
					black += 3;
					break;
				case 'r': // 흑 룩
					black += 5;
					break;
				case 'q': // 흑 퀸
					black += 9;
					break;
				// 그 외에는 점수 0
				}
			}
		}
		System.out.println(white - black); // 출력
		br.close();
	}
}