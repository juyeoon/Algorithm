import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 현재 그룹, 현재 가진 사탕 수, 진화에 필요한 사탕 수가 주어졌을 때 진화를 하기 위해 몇 km를 걸어야 하는지 구하는 문제 
// 현재 가진 사탕으로 진화까지 가능할 때는 안 걸어도 됨
// 그룹 1일 때, 진화까지 필요한 사탕 수 * 1km
// 그룹 2일 때, 진화까지 필요한 사탕 수 * 3km
// 그룹 3일 때, 진화까지 필요한 사탕 수 * 5km
public class B18691_Pokemon_Buddy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int G = Integer.parseInt(st.nextToken()); // 그룹
			int C = Integer.parseInt(st.nextToken()); // 현재 가진 사탕 수
			int E = Integer.parseInt(st.nextToken()); // 진화에 필요한 사탕 수
			if (E - C <= 0) { // 현재 가진 사탕으로 진화까지 가능할 때
				sb.append(0); // 0 출력
			} else if (G == 1) { // 그룹 1일 때 1km마다 사탕을 얻음
				sb.append(E - C); // 진화까지 필요한 사탕 수 * 1km
			} else if (G == 2) { // 그룹 2일 때 3km마다 사탕을 얻음
				sb.append((E - C) * 3); // 진화까지 필요한 사탕 수 * 3km
			} else { // 그룹 3일 때 5km마다 사탕을 얻음
				sb.append((E - C) * 5); // 진화까지 필요한 사탕 수 * 5km
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}