import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 알파벳 26개에 대한 E(X)값으로 변경한 암호문의 알파벳을 구하고 배열에 저장
// 입력받은 평문을 순회하여 문자를 인덱스로 암호 문자 배열의 값을 출력에 저장한 후 암호화 문자열 출력
public class B11575_Affine_Cipher {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // a
			int b = Integer.parseInt(st.nextToken()); // b
			char c[] = new char[26]; // E(x)값에 해당하는 문자
			for (int i = 0; i < 26; i++) { // c[] 구하기
				c[i] = (char) ((a * i + b) % 26 + 'A');
			}
			String s = br.readLine(); // 평문 s
			int leng = s.length(); // s 길이(반복문 종료 조건)
			for (int i = 0; i < leng; i++) { // 암호문으로 변경
				sb.append(c[s.charAt(i)-'A']);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}