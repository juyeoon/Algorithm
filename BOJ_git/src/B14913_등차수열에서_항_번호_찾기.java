import java.io.*;
import java.util.*;

public class B14913_등차수열에서_항_번호_찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		double d = Double.parseDouble(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		double n = (k - a) / d + 1;
		if (n <= 0 || n % 1 != 0.0) {
			System.out.println("X");
		} else {
			System.out.println((int) n);
		}
		br.close();
	}
}
