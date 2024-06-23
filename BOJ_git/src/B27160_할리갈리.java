import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력받은 과일 이름에 맞게 수를 합한 후 5가 있으면 YES 아니면 NO 출력
public class B27160_할리갈리 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 카드 개수
		int[] cnt = new int[4]; // 과일 개수의 합 배열
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String S = st.nextToken(); // 과일 이름
			int num = Integer.parseInt(st.nextToken()); // 과일 개수
			if (S.equals("STRAWBERRY")) { // STRAWBERRY
				cnt[0] += num;
			} else if (S.equals("BANANA")) { // BANANA
				cnt[1] += num;
			} else if (S.equals("LIME")) { // LIME
				cnt[2] += num;
			} else { // PLUM
				cnt[3] += num;
			}
		}
		boolean five = false; // 5개인 과일이 있는지 (true: 있음)
		for (int i : cnt) {
			if (i == 5) { // 5개가 있는 경우
				five = true;
				break;
			}
		}
		System.out.println(five ? "YES" : "NO"); // 출력
		br.close();
	}
}