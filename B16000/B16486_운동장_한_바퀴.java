import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 운동장 둘레 = (직사각형(C)의 가로 길이(d1) * 2) + (원의 둘레)
public class B16486_운동장_한_바퀴 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int d1 = Integer.parseInt(br.readLine()); // 직사각형의 가로 길이
		int d2 = Integer.parseInt(br.readLine()); // 반지름
		System.out.println(d1 * 2 + (double) d2 * 2 * 3.141592); // 출력
		br.close();

	}
}