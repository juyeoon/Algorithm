import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/3054
public class B3054_피터팬_프레임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 입력 단어
		int rowLen = s.length() * 4 + 1; // 프레임 열 길이
		char[][] frame = new char[3][rowLen]; // 프레임
		for (int i = 0; i < 3; i++) { // .으로 채우기
			Arrays.fill(frame[i], '.');
		}
		// 프레임을 #으로 만들기
		for (int i = 2; i < rowLen; i += 4) { // 0열
			frame[0][i] = '#';
		}
		for (int i = 1; i < rowLen; i += 2) { // 1열
			frame[1][i] = '#';
		}
		for (int i = 0; i < rowLen; i += 4) { // 2열
			frame[2][i] = '#';
		}
		for (int i = 2, idx = 0; i < rowLen; i += 4, idx++) { // 단어
			frame[2][i] = s.charAt(idx);
		}
		// 3의 배수 문자의 프레임을 *로 바꾸기
		for (int i = 10; i < rowLen; i += 12) {
			frame[0][i] = '*';
			frame[1][i - 1] = '*';
			frame[1][i + 1] = '*';
			frame[2][i - 2] = '*';
			frame[2][i + 2] = '*';
		}
		for (int i = 0; i < 3; i++) { // 0~2열 출력 저장
			for (int j = 0; j < rowLen; j++) {
				sb.append(frame[i][j]);
			}
			sb.append("\n");
		}
		for (int i = 1; i >= 0; i--) { // 1~0열 출력 저장
			for (int j = 0; j < rowLen; j++) {
				sb.append(frame[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
