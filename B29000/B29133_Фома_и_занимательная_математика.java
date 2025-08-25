import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/29133
// a, b, c, d가 주어지고 a^x + b^x + c^x = d를 만족하는 x는 {1, 2, 3} 중 하나라고 헸을 때
// 참이 되는 x를 찾는 문제. 해가 하나가 아니면 -1 출력.
// 풀이: 1부터 3까지 계산하여 확인
public class B29133_Фома_и_занимательная_математика {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int ans = -1; // 참이 되는 해
		for (int i = 1; i <= 3; i++) { // 1~3만 확인
			int ax = (int) Math.pow(a, i);
			int bx = (int) Math.pow(b, i);
			int cx = (int) Math.pow(c, i);
			if (ax + bx + cx == d) { // 방정식이 참이 되면
				if (ans == -1) { // 앞에서 참이 되는 해가 없었으면
					ans = i; // 정답으로 저장
				} else { // 앞에서 참이 되는 해가 있었으면
					ans = -1; // 하나로 정할 수 없음
					break;
				}

			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
