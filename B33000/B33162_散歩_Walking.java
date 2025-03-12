import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33162
// 첫 번째는 3m를 앞으로 가고 두 번째는 뒤로 2m를 가는 것을 반복할 때 X번째가 주어지면 총 앞으로 이동한 거리는 얼마인지 구하는 문제
// 반복문을 사용하여 i를 2로 나누었을 때 짝수면 +3 아니면 -2
public class B33162_散歩_Walking {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()); // 횟수
		int d = 0; // 앞으로 이동한 거리
		for (int i = 0; i < X; i++) {
			if (i % 2 == 0) {
				d += 3;
			} else {
				d -= 2;
			}
		}
		System.out.println(d); // 출력
		br.close();
	}
}
