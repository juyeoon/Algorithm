import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수직선 상의 두 점 a, b, x, y가 있음
// x, y에 순간이동 장치가 있고 a에서 b로 배설물을 옮길 때, 배설물을 수동으로 옮겨야하는 최소 거리를 구하는 문제
// 총 세 개의 경우의 수
// i) a에서 b로 바로 옮기는 경우
// ii) a -> x -> y -> b로 옮기는 경우
// iii) a -> y -> x -> b로 옮기는 경우
public class B15751_Teleportation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // 시작점
		int b = Integer.parseInt(st.nextToken()); // 도착점
		int x = Integer.parseInt(st.nextToken()); // 순간이동 장치 위치 1
		int y = Integer.parseInt(st.nextToken()); // 순간이동 장치 위치 2
		int route1 = Math.abs(a - b); // i) a에서 b로 바로 옮기는 경우
		int route2 = Math.abs(x - a) + Math.abs(y - b); // ii) a -> x -> y -> b로 옮기는 경우
		int route3 = Math.abs(x - b) + Math.abs(y - a); // iii) a -> y -> x -> b로 옮기는 경우
		System.out.println(Math.min(route1, Math.min(route2, route3))); // 세 경우 중 최소 거리 출력
		br.close();
	}
}
