import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복문으로 단순 출력
public class B9316_Hello_Judge {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 반복 개수
		for (int i = 1; i <= N; i++) { // 반복, sb에 저장
			sb.append("Hello World, Judge ").append(i).append("!\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}