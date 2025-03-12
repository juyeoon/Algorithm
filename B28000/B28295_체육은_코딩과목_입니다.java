import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 북쪽을 0도로 시계방향으로 각도가 +되며
// 우향우 => +90, 뒤로 돌아 => +180, 좌향좌 => +270
// 10개가 끝난 후 360으로 나눈 나머지로 확인
// 0 => 북, 90 => 동, 180 => 남, 270 => 서
public class B28295_체육은_코딩과목_입니다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int angle = 0; // 학생들의 각도
		for (int tc = 0; tc < 10; tc++) { // 10개의 지시
			int N = Integer.parseInt(br.readLine()); // 명령
			if (N == 1) { // 우향우
				angle += 90;
			} else if (N == 2) { // 뒤로 돌아
				angle += 180;
			} else { // 좌향좌
				angle += 270;
			}
		}
		angle %= 360; // 360도로 나누기
		if (angle == 0) { // 북
			System.out.println('N');
		} else if (angle == 90) { // 동
			System.out.println('E');
		} else if (angle == 180) { // 남
			System.out.println('S');
		} else if (angle == 270) { // 서
			System.out.println('W');
		}
		br.close();
	}
}