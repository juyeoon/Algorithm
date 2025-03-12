import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//두 점(중심) 사이의 거리가 두 과녁의 반지름의 합보다 작으면 겹치는 부분이 존재함
public class B22938_백발백준하는_명사수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long X1 = Long.parseLong(st.nextToken()); // 첫번째 과녁 중심 x
		long Y1 = Long.parseLong(st.nextToken()); // 첫번째 과녁 중심 y
		long R1 = Long.parseLong(st.nextToken()); // 첫번째 과녁 반지름 r
		st = new StringTokenizer(br.readLine());
		long X2 = Long.parseLong(st.nextToken()); // 두번째 과녁 중심 x
		long Y2 = Long.parseLong(st.nextToken()); // 두번째 과녁 중심 y
		long R2 = Long.parseLong(st.nextToken()); // 두번째 과녁 반지름 r
		// 두 점(중심) 사이의 거리가 두 과녁의 반지름의 합보다 작으면 겹치는 부분이 존재
		System.out.println((Math.sqrt((X1 - X2) * (X1 - X2) + (Y1 - Y2) * (Y1 - Y2)) < R1 + R2) ? "YES" : "NO");
		br.close();
	}
}