import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/4635
// 속도와 누적 경과 시간이 주어졌을 때 총 이동한 거리를 구하는 문제
// 이전 속도까지의 누적 경과 시간을 저장하여 현재 속도 * (현재 누적 시간 - 이전 누적 시간)을 구함 = 현재 속도로 이동한 거리
// 속도별 이동한 거리를 모두 더한 값 출력
public class B4635_Speed_Limit {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 속도 개수
		while (N != -1) { // EOI
			int ctime = 0; // 이전 누적 경과 시간
			int d = 0; // 총 이동 거리
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int speed = Integer.parseInt(st.nextToken()); // 현재 속도
				int time = Integer.parseInt(st.nextToken()); // 현재까지의 누적 경과 시간
				d += speed * (time - ctime); // 현재 속도로 이동한 거리
				ctime = time; // 이전 누적 경과 시간 갱신
			}
			sb.append(d).append(" miles\n"); // 출력 저장
			N = Integer.parseInt(br.readLine()); // EOI용
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
