import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이중 for문으로 별찍기
public class B2440_별_찍기_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // N번째 줄까지 출력
		for (int i = N; i > 0; i--) { // 줄 반복
			for (int j = 0; j < i; j++) { // 문자 반복 
				sb.append('*');
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}