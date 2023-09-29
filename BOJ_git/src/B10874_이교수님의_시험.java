import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 시험의 정답은 "1 2 3 4 5 1 2 3 4 5"이므로 입력 문자열이 "1 2 3 4 5 1 2 3 4 5"와 같은지 확인
public class B10874_이교수님의_시험 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 학생 수
		for (int i = 1; i <= N; i++) {
			if (br.readLine().equals("1 2 3 4 5 1 2 3 4 5")) { // 정답과 입력 문자열이 같으면
				sb.append(i).append("\n"); // 학생 번호 추가
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}