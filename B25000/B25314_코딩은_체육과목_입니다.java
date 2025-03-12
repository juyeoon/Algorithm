import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// byte를 4로 나눈만큼 long 출력 후 마지막에 int 출력
public class B25314_코딩은_체육과목_입니다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // N byte
		for (int i = N / 4; i > 0; i--) { // N/4 만큼 반복
			sb.append("long ");
		}
		sb.append("int"); // 마지막 int 출력
		System.out.println(sb);
		br.close();
	}
}
