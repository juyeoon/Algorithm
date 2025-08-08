import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32800
// 가장 많은 사람이 버스에 타 있을 때의 인원을 계산하여 그 값을 버스의 최소 수용 인원으로 출력
public class B32800_Bus_Assignment {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = 0; // 최대 탑승 인원
		int current = 0; // 현재 버스에 있는 인원 수
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 내리는 사람 수
			int b = Integer.parseInt(st.nextToken()); // 타는 사람 수
			current -= a; // 내리기
			current += b; // 타기
			if (current > max) { // 최대 인원 갱신
				max = current;
			}
		}
		System.out.println(max); // 출력
		br.close();
	}
}
