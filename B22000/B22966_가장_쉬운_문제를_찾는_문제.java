import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최저 난이도와 그 난이도를 가지는 문제를 저장하는 변수를 사용하여
// 문제마다 최저 난이도가 문제 난이도보다 높을 때 두 정보를 갱신
public class B22966_가장_쉬운_문제를_찾는_문제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 문제 개수
		int minLevel = Integer.MAX_VALUE; // 최저 난이도
		String minName = ""; // 최저 난이도를 가지는 문제 이름
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken(); // 문제 이름
			int level = Integer.parseInt(st.nextToken()); // 문제 난이도
			if (minLevel > level) { // 최저 난이도가 현재 문제 난이도보다 높을 때
				minLevel = level; // 갱신
				minName = name;
			}
		}
		System.out.println(minName); // 최저 난이도를 가지는 문제 이름 출력
		br.close();
	}
}