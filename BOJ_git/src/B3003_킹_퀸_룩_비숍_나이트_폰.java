import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3003_킹_퀸_룩_비숍_나이트_폰 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] full = { 1, 1, 2, 2, 2, 8 }; // 완성 피스 개수
		int[] white = new int[6]; // 지금 있는 흰색 피스 개수
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < 6; i++) {
			white[i] = Integer.parseInt(s[i]);
		} // input
		for (int i = 0; i < 6; i++) {
			sb.append(full[i] - white[i]).append(" ");
		} // 필요한 흰색 피스 개수
		System.out.println(sb);
		br.close();
	}
}
