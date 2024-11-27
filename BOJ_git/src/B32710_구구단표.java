import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3181
// 2부터 9까지 해당 숫자를 나누었을 때 나머지가 0이고 몫이 2~9 사이면 존재하는 것
// 또한 구구단 식(axb)에서 1~9까지 등장하기 때문에 해당 범위 안이면 존재
public class B32710_구구단표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력 받은 수
		boolean ap = false; // 존재 여부 (true: 존재)
		if (N < 10) { // 구구단 식에 있으면
			ap = true;
		}
		for (int i = 2; i <= 9; i++) { // 2~9단 확인
			if (N % i == 0 && N / i <= 9) { // 나머지가 0이고 몫이 2~9일 때
				ap = true; // 존재
				break; // 더 확인 필요 x
			}
		}
		System.out.println(ap ? 1 : 0); // 출력
		br.close();
	}
}
