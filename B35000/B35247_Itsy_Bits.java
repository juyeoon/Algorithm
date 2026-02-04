import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 35247 - Itsy Bits
// https://www.acmicpc.net/problem/35247
public class B35247_Itsy_Bits {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		int bits = 64 - Long.numberOfLeadingZeros(n);
		int b = 1;
		while (b < bits) {
			b <<= 1;
		}
		if (b == 1) {
			System.out.println("1 bit");
		} else {
			System.out.println(b + " bits");
		}
		br.close();
	}
}
