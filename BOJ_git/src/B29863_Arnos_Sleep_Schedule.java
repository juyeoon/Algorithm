import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Arno가 잔 시간 = (일어난 시각 - 잠든 시각 + 24) % 24
// 잠든 시각이 20~3이기 때문에 24를 더하고 24로 나눈 나머지 사용
public class B29863_Arnos_Sleep_Schedule {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println((b - a + 24) % 24);
		br.close();
	}
}