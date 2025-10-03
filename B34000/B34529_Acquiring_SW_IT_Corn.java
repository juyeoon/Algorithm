import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34529
// 한 회사에서 구매할 양 = ng당 단가 * 구매할 양 / n
public class B34529_Acquiring_SW_IT_Corn {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken()); // A사 100g 단가
		int Y = Integer.parseInt(st.nextToken()); // B사 50g 단가
		int Z = Integer.parseInt(st.nextToken()); // C사 20g 단가
		st = new StringTokenizer(br.readLine());
		int U = Integer.parseInt(st.nextToken()); // A사에서 구매할 양
		int V = Integer.parseInt(st.nextToken()); // B사에서 구매할 양
		int W = Integer.parseInt(st.nextToken()); // C사에서 구매할 양
		int sum = X * U / 100 + Y * V / 50 + Z * W / 20; // A사 + B사 + C사
		System.out.println(sum); // 출력
		br.close();
	}
}
