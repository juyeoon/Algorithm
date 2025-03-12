import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// I, O, J 중 J가 나오면 그 앞의 문자를 출력하는 문제
public class B24084_次の文字_Next_Character {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문자열 길이
		char c[] = br.readLine().toCharArray(); // 입력 문자열
		for (int i = 1; i < N; i++) { // [1]부터 시작
			if (c[i] == 'J') { // J가 나오면
				sb.append(c[i - 1]).append("\n"); // 앞의 문자 출력
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
