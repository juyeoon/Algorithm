import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 녹색거탑의 정상에서 바닥으로 내려오는 경우의 수는 높이의 제곱과 같다
public class B24723_녹색거탑 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 녹색 거탑의 높이
		System.out.println((int) Math.pow(2, N)); // 경우의 수 출력
		br.close();
	}
}