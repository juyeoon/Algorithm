import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34411
public class B34411_M_Climb {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine()); // 암석 개수
		int n = Integer.parseInt(br.readLine()); // 페인트 1리터 가격
		int y = Integer.parseInt(br.readLine()); // 예산이 적용되는 연도
		System.out.println(m * n); // 암석 개수 * 페인트 1리터 가격
		br.close();
	}
}
