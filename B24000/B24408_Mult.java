import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/24408
// 배수를 확인할 수(num)의 초기값을 0으로 두고 0이면 num을 해당 값으로 갱신
// num이 0이 아니고 현재 값이 num으로 나누었을 때 나머지가 0이면 배수이므로 출력 저장 후 num을 0으로 초기화
// 이걸 n번 반복
public class B24408_Mult {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 원소 개수
		int num = 0; // 배수를 확인할 수
		for (int i = 0; i < n; i++) {
			int now = Integer.parseInt(br.readLine()); // 현재 값
			if (num == 0) { // 배수를 확인할 수를 설정
				num = now;
			} else {
				if (now % num == 0) { // 배수일 때
					sb.append(now).append("\n"); // 출력 저장
					num = 0; // 초기화
				}
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
