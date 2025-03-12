import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/28061
// 각각의 레몬 나무에서 레몬을 딴 후에 남은 거리만큼을 뺀 것들 중에 최댓값을 찾기
public class B28061_레몬_따기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 레몬 나무 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0; // 최대로 가져갈 수 있는 레몬 개수
		for (int i = N; i > 0; i--) { // 현재 위치에서 집까지의 거리
			max = Math.max(max, Integer.parseInt(st.nextToken()) - i); // 최대 레몬 개수 갱신
		}
		System.out.println(max); // 출력
		br.close();
	}
}