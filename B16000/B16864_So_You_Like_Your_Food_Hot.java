import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16864
// 달러와 센트이므로 100씩 곱해서 정수로 만든 후 계산 (실수 나누기 연산에서 예외사항 발생 가능)
public class B16864_So_You_Like_Your_Food_Hot {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long pt = Math.round(Double.parseDouble(st.nextToken()) * 100);
		long p1 = Math.round(Double.parseDouble(st.nextToken()) * 100);
		long p2 = Math.round(Double.parseDouble(st.nextToken()) * 100);
		int pitaCnt = 0;
		double pizzaRevenue = 0;
		while (true) {
			pizzaRevenue = pt - pitaCnt * p1;
			if (pizzaRevenue < 0) {
				break;
			}
			if (pizzaRevenue % p2 == 0) {
				sb.append(pitaCnt).append(" ").append((int) (pizzaRevenue / p2)).append("\n");
			}
			pitaCnt++;
		}
		System.out.println((sb.length() == 0) ? "none" : sb);
		br.close();
	}
}
