import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3578
// 구멍이 0개 => 1
// 구멍이 1개 => 0
// 구멍이 2개 이상 => 짝수 => 888...
// 			=> 홀수 => 4888... 
public class B3578_Holes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int h = Integer.parseInt(br.readLine());
		int repeat8 = h / 2; // 8을 반복할 횟수
		int remainder = h % 2; // 8로 해결하지 않은 구멍 수
		if (h == 0) { // 0
			sb.append(1);
		} else if (h == 1) { // 1
			sb.append(0);
		} else { // 2 ~
			if (remainder == 1) { // 8로 해결하지 않은 구멍이 있으면 앞에 4 추가
				sb.append("4");
			}
			for (int i = 0; i < repeat8; i++) { // 남은 구멍을 8로 해결
				sb.append("8");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
