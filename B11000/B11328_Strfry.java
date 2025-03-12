import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 문자열의 문자 종류와 개수가 같은지 확인
// 알파벳 개수를 저장하는 배열을 사용 후 배열이 같은지 확인
public class B11328_Strfry {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int A[] = new int[26]; // 1번 문자열의 알파벳 개수 저장
			int B[] = new int[26]; // 2번 문자열의 알파벳 개수 저장
			boolean possible = true; // 가능 여부
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken(); // 1번 문자열
			String b = st.nextToken(); // 2번 문자열
			if (a.length() != b.length()) { // 길이가 다르면 불가능
				possible = false;
			} else {
				int leng = a.length();
				for (int i = 0; i < leng; i++) { // 문자열 길이만큼 반복
					A[a.charAt(i) - 'a']++; // 알파벳 개수 세기
					B[b.charAt(i) - 'a']++;
				}
				for (int i = 0; i < 26; i++) { // 배열이 같은지 확인
					if (A[i] != B[i]) {
						possible = false;
					}
				}
			}
			sb.append(possible ? "Possible\n" : "Impossible\n"); // 결과 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}