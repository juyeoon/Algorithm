import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// m*n 크기의 정사각형이 1*1 크기의 타일로 이루어져 있을 때, 테두리의 타일 개수를 구하는 문제
// => 전체 타일 개수 - 테두리를 제외한 타일 개수
// = (m * n) - ((m - 2)*(n - 2))
// m과 n 중 하나라도 1이면 -2를 한 값이 음수일 수 있으므로 예외처리
public class B27213_Граничные_клетки {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine()); // 직사각형 한 변의 길이
		int n = Integer.parseInt(br.readLine()); // 직사각형의 다른 한 변의 길이
		if (m == 1 || n == 1) { // 예외 처리
			System.out.println(m * n);
		} else { // 계산
			System.out.println(m * n - (m - 2) * (n - 2));
		}
		br.close();
	}
}