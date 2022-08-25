import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 현재 신장 - 1년 전 신장
public class B24086_身長_Height {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		System.out.println(B - A);
		br.close();
	}
}
