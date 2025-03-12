import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 0을 모두 1로 바꾸거나 1을 모두 0으로 바꿀 때, 바꿔야 하는 거품 중 가장 작은 개수를 찾는 문제
// 2차원 배열의 0을 모두 1로 바꿀 때의 변경 횟수와 1을 모두 0으로 바꿀 때의 변경 횟수 중 작은 값을 출력
public class B30585_Поп_ит {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int h = Integer.parseInt(st.nextToken()); // 팝잇 높이
		int w = Integer.parseInt(st.nextToken()); // 너비
		int zeroCnt = 0; // 0 개수
		int oneCnt = 0; // 1 개수
		for (int i = 0; i < h; i++) { // 0과 1의 개수 찾기
			String s = br.readLine();
			for (int j = 0; j < w; j++) {
				if (s.charAt(j) == '0') { // 0
					zeroCnt++;
				} else { // 1
					oneCnt++;
				}
			}
		}
		System.out.println(Math.min(zeroCnt, oneCnt)); // 둘 중 작은 값 출력
		br.close();
	}
}