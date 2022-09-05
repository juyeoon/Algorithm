import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// StringBuilder를 사용하여 입력 문자열 앞에 숫자 넣기
public class B4470_줄번호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 문자열 개수
		for (int i = 1; i <= N; i++) {
			sb.append(i).append(". ").append(br.readLine()).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
