import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 한 줄의 수를 다 더한 값으로 구분
public class B2490_윷놀이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		char[] result = { 'D', 'C', 'B', 'A', 'E' }; // 윷, 걸, 개, 도, 모
		for (int i = 0; i < 3; i++) { // 3줄 입력
			st = new StringTokenizer(br.readLine());
			int sum = 0; // 한 줄의 합
			for (int j = 0; j < 4; j++) { // 윷 4개
				sum += Integer.parseInt(st.nextToken());
			}
			sb.append(result[sum]).append("\n"); // 합 개수(idx)에 따른 결과 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}