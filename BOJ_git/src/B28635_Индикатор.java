import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 몇 바퀴를 돌았는지 세는 카운터가 표시할 수 있는 최대의 수(m)
// 현재 카운터에 표시되어 있는 수(a)
// 카운터에 표시되어야 하는 수(b)가 주어졌을 때 카운터를 몇 번 눌러야 하는지를 구하는 문제
// a <= b이면 m값에 상관 없이 b - a 출력
// a > b m까지의 값(m-a)과 0부터 b까지의 값(0+b)의 합 출력
public class B28635_Индикатор {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine()); // 몇 바퀴를 돌았는지 세는 카운터가 표시할 수 있는 최대의 수
		int a = Integer.parseInt(br.readLine()); // 현재 카운터에 표시되어 있는 수
		int b = Integer.parseInt(br.readLine()); // 카운터에 표시되어야 하는 수
		if (a <= b) { // a <= b이면 m값에 상관 없이 b - a 출력
			System.out.println(b - a);
		} else { // a > b m까지의 값(m-a)과 0부터 b까지의 값(0+b)의 합 출력
			System.out.println(m - a + b);
		}
		br.close();
	}
}