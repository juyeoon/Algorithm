import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

// 15858 - Simple Arithmetic
// https://www.acmicpc.net/problem/15858
public class B15858_Simple_Arithmetic {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigDecimal a = new BigDecimal(st.nextToken());
		BigDecimal b = new BigDecimal(st.nextToken());
		BigDecimal c = new BigDecimal(st.nextToken());
        BigDecimal result = a.multiply(b).divide(c, 20, BigDecimal.ROUND_HALF_UP);
        System.out.println(result);
		br.close();
	}
}
