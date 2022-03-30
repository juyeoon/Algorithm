import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//boolean 배열 사용 // 680ms 124836KB
public class B2751_수_정렬하기2_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		boolean check[] = new boolean[2000001];
		for (int i = 0; i < N; i++) {
			check[Integer.parseInt(br.readLine()) + 1_000_000] = true;
		} // input
		for (int i = 0; i < check.length; i++) {
			if (check[i])
				sb.append(i - 1_000_000).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
