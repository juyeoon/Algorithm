import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26027
// r^2보다 1씩 증가시키며 (r^2 + 1, r^2 + 2, ...) 가능한 제곱합 값을 탐색
// 각 제곱합 값에 대해 x^2 + y^2 = 해당 값이 되는 정수 x, y가 존재하는지 확인
// x^2를 1부터 증가시키고, y^2를 (제곱합 - x^2)로 설정하여 두 값이 모두 완전제곱인지 확인
// 가장 처음 발견되는 정수 좌표를 출력
public class B26027_Disc_District_풀이1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long r = Long.parseLong(br.readLine()); // 반지름
		long r2 = r * r; // 반지름의 제곱
		long x = 0; // 정답의 x좌표
		long y = 0; // 정답의 y좌표
		Loop: while (true) { // 정답을 찾을 때까지 반복
			r2++; // 두 좌표 제곱의 합의 값을 1씩 증가하면서 찾기
			long tmpX2 = 1; // 확인할 x좌표의 제곱값
			long tmpY2 = r2 - 1; // 확인할 y좌표의 제곱값
			while (tmpX2 <= tmpY2) { 
				long tmpX = (long) Math.sqrt(tmpX2);
				long tmpY = (long) Math.sqrt(tmpY2);
				if (tmpX * tmpX + tmpY * tmpY == r2) { // 확인할 좌표가 정수가 되는지 확인
					x = tmpX;
					y = tmpY;
					break Loop;
				} else { // 안 되면 확인할 좌표를 수정
					tmpX2++;
					tmpY2--;
				}
			}
		}
		System.out.println(x + " " + y); // 출력
		br.close();
	}
}
