import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 사과의 x좌표와 같은 사람에게 떨어짐
public class B13118_뉴턴과_사과 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		String s[] = br.readLine().split(" ");
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()); // 사과의 x 좌표
		int ans = 0; // 사과가와 충돌하는 사람의 번호
		for (int i = 0; i < 4; i++) {
			if (Integer.parseInt(s[i]) == x) { // 사과의 x좌표와 같으면
				ans = i + 1; // 번호 갱신
				break; // 사과는 한명만 맞으므로 반복문 탈출
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}