import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 'ㅂ'을 'ㅣ', '=', 'ㅣ' 로 나누어서 찍기
public class B23808_골뱅이_찍기_ㅂ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		char[] center = { ' ', ' ', '@', ' ', '@' }; // 가운데 문자
		for (int i = 0; i < 5; i++) { // 다른 모양 5줄
			for (int k = 0; k < N; k++) { // 한 줄을 N번씩 반복
				for (int j = 0; j < N; j++) { // 기둥
					sb.append('@');
				}
				for (int j = N * 3; j > 0; j--) { // 가운데
					sb.append(center[i]);
				}
				for (int j = 0; j < N; j++) { // 기둥
					sb.append('@');
				}
				sb.append('\n');
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}