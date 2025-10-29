import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/33652
// LED가 꺼진 상태로 기록된 시점 중 가장 이른 시간을 찾는 문제
// => LED가 꺼져있을 때(O == 0) 기록 시각(M)의 최소값을 갱신
public class B33652_Testing_LEDs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long minOff = Long.MAX_VALUE; // 최소 시각
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
            long M = Long.parseLong(st.nextToken()); // 기록 시각
            int O = Integer.parseInt(st.nextToken()); // LED 상태
            if (O == 0 && M < minOff) {
                minOff = M;
            }
		}
		System.out.println(minOff == Long.MAX_VALUE ? -1 : minOff);
		br.close();
	}
}
