import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 총 시간 = 일 수 * 24
public class B27327_時間_Hour {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()); // 일 수
		System.out.println(X * 24); // 총 시간 출력
	}
}