import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2530 - 인공지능 시계
// https://www.acmicpc.net/problem/2530
public class B2530_인공지능_시계 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int t[] = new int[3]; // 시, 분, 초
		for (int i = 0; i < 3; i++) { // input
			t[i] = Integer.parseInt(s[i]);
		}
		t[2] += Integer.parseInt(br.readLine()); // 추가 시간(초)를 초에 더함
		for (int i = 2; i > 0; i--) { // 초, 분 계산
			t[i - 1] += t[i] / 60; // 넘는 시간(나누기) 위의 단위로 넘겨주기
			t[i] = t[i] % 60; // 넘고 남은 시간(나머지)를 해당 단위에 다시 넣기
		}
		System.out.printf("%d %d %d",t[0] % 24, t[1], t[2]); // 시 계산 + 출력
		br.close();
	}
}
