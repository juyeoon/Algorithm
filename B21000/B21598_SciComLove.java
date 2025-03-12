import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력받은 N만큼 "SciComLove" 반복
public class B21598_SciComLove {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			sb.append("SciComLove\n");
		}
		System.out.println(sb);
		br.close();
	}
}
