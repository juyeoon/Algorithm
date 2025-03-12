import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N × N 정사각형으로 이루어진 그리드에 있는 서로 다른 정사각형 개수
// = N*N(1x1 정사각형) + (N-1)*(N-1)(2x2 정사각형) + ... + 1*1(NxN 정사각형)
// = N * (N + 1) * (2 * N + 1) / 6
public class B5724_파인만 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOI
			int N = Integer.parseInt(s); // N
			sb.append(N * (N + 1) * (2 * N + 1) / 6).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}