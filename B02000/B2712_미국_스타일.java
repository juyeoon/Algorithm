import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제에 주어진 값을 곱하여 단위 변환
public class B2712_미국_스타일 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String s[] = br.readLine().split(" ");
			double value = Double.parseDouble(s[0]);
			if (s[1].equals("kg")) { // kg -> lb
				sb.append(String.format("%.4f", value * 2.2046)).append(" lb\n");
			} else if (s[1].equals("lb")) { // lb -> kg
				sb.append(String.format("%.4f", value * 0.4536)).append(" kg\n");
			} else if (s[1].equals("l")) { // g -> l
				sb.append(String.format("%.4f", value * 0.2642)).append(" g\n");
			} else { // l -> g
				sb.append(String.format("%.4f", value * 3.7854)).append(" l\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}