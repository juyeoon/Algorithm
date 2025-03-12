import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 첫째 줄과 마지막 줄에 "@"가 N+2개
// 그 사이 N개의 줄에는 처음과 끝에 "@"가 하나씩. 그 사이에 " "가 N개
public class B23794_골뱅이_찍기_정사각형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N + 2; i++) { // 첫째 줄
			sb.append("@");
		}
		sb.append("\n");
		for (int i = 0; i < N; i++) { // 2 ~ N+1 줄
			sb.append("@"); // 처음
			for (int j = 0; j < N; j++) { // 사이 N개의 공백
				sb.append(" ");
			}
			sb.append("@\n"); // 끝
		}
		for (int i = 0; i < N + 2; i++) { // 마지막 줄
			sb.append("@");
		}
		bw.write(sb.toString()); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}