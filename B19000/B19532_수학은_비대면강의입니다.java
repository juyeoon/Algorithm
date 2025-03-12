import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연립방정식을 만족하는 x와 y의 범위가 작기 때문에 범위 안의 모든 x와 y를 대입하는 브루트포스 알고리즘 사용
public class B19532_수학은_비대면강의입니다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
		int d = Integer.parseInt(s[3]);
		int e = Integer.parseInt(s[4]);
		int f = Integer.parseInt(s[5]);
		int x = -999; // 방정식을 만족하는 x
		int y = -999; // 방정식을 만족하는 y
		Loop: while (x < 1000) { // x값 변경
			while (y < 1000) { // y값 변경
				if (a * x + b * y == c && d * x + e * y == f) { // 연립방정식을 만족하면
					break Loop; // 반복문 전체 탈출
				}
				y++; // 다음 y값
			}
			y = -999; // y값 초기화
			x++; // 다음 x값
		}
		System.out.println(x + " " + y); // 출력
		br.close();
	}
}