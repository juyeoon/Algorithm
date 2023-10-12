import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 삼각형 넓이 = 밑변의 길이 * 높이 * 0.5
public class B29751_삼각형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		double W = Double.parseDouble(s[0]); // 밑변의 길이
		double H = Double.parseDouble(s[1]); // 높이
		System.out.println(String.format("%.1f", W * H * 0.5)); // 넓이 출력
		br.close();
	}
}