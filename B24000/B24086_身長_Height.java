import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 현재 신장 - 1년 전 신장
public class B24086_身長_Height {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine()); // 1년 전 신장
		int B = Integer.parseInt(br.readLine()); // 현재 신장
		System.out.println(B - A); // 출력
		br.close();
	}
}
