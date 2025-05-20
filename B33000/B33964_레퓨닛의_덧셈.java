import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/33964
// X자리 레퓨닛과 Y자리 레퓨닛의 합은 |X-Y|자리의 1과 X와 Y의 최솟값자리의 2로 이루어져 있음
public class B33964_레퓨닛의_덧셈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken()); // X자리
		int Y = Integer.parseInt(st.nextToken()); // Y자리
		int twoCnt = Math.min(X, Y); // 2의 개수
		int oneCnt = Math.abs(X - Y); // 1의 개수
		for (int i = 0; i < oneCnt; i++) { // 1
			sb.append("1");
		}
		for (int i = 0; i < twoCnt; i++) { // 2
			sb.append("2");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
