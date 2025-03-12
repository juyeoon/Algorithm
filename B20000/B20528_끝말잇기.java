import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 모든 단어가 팰린드롬이므로 모든 단어의 첫번째 문자가 같아야 끝말잇기 가능
public class B20528_끝말잇기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 문자열 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean possible = true; // 끝말잇기 가능 여부(true: 가능)
		char c = st.nextToken().charAt(0); // 첫번째 단어의 첫번째 문자(기준)
		for (int i = 1; i < N; i++) { // 나머지 문자 순회
			if (c != st.nextToken().charAt(0)) { // 첫번째 문자가 같지 않으면
				possible = false; // 끝말잇기 불가능
				break; // 더 확인 필요 없음
			}
		}
		System.out.println(possible ? 1 : 0); // 출력
		br.close();
	}
}