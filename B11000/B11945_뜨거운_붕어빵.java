import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// StringBuilder의 reverse()를 사용하여 뒤집기
public class B11945_뜨거운_붕어빵 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 행 수
		int M = Integer.parseInt(st.nextToken()); // 열 수
		for (int i = 0; i < N; i++) {
			StringBuilder temp = new StringBuilder(br.readLine()).reverse(); // 입력 받은 행 뒤집기
			sb.append(temp.toString()).append("\n"); // 뒤집은 행 sb에 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
