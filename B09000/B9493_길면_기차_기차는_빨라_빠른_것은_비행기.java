import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 9493 - 길면 기차, 기차는 빨라, 빠른 것은 비행기
// https://www.acmicpc.net/problem/9493
public class B9493_길면_기차_기차는_빨라_빠른_것은_비행기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0 0")) {
			StringTokenizer st = new StringTokenizer(s);
			int M = Integer.parseInt(st.nextToken());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			long numerator = Math.abs((long)M * B - (long)M * A) * 3600;
			long denominator = (long) A * B;
			long diffSec = (numerator + denominator / 2) / denominator;
			long hours = diffSec / 3600;
			long minutes = (diffSec % 3600) / 60;
			long seconds = diffSec % 60;
			sb.append(String.format("%d:%02d:%02d\n", hours, minutes, seconds));
		}
		System.out.println(sb);
		br.close();
	}
}
