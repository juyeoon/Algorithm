import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 가게가지 가는데 걸리는 시간보다 빵이 들어오는 시간이 더 길면 살 수 없음
// 빵을 살 수 있는 경우들의 최소값을 구함
public class B25377_빵 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 가게 수
		int min = Integer.MAX_VALUE; // 빵을 구하는데 걸리는 최소 시간
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken()); // 현재 위치에서 가게까지 가는 데 걸리는 시간
			int B = Integer.parseInt(st.nextToken()); // 현재 시점에서 빵이 들어올 때까지 시간
			if (A <= B) { // 빵을 살 수 있을 때
				min = Math.min(min, B); // 최솟값 갱신
			}
		}
		if (min == Integer.MAX_VALUE) { // 모든 경우에 빵을 살 수 없었으면
			min = -1; // -1로 갱신
		}
		System.out.println(min); // 최솟값 출력
		br.close();
	}
}