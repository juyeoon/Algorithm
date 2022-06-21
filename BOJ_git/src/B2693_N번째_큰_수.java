import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 배열에 저장 후 정렬, [7](뒤에서 세번째) 출력
public class B2693_N번째_큰_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int num[] = new int[10];
			for (int i = 0; i < 10; i++) { // 숫자 저장
				num[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(num); // 오름차순으로 정렬
			sb.append(num[7]).append("\n"); // [7](뒤에서 세번째) sb에 추가
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
