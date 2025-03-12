import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 문자를 모두 소문자로 변환 후 char 배열로 저장
// 배열을 순회하면서 'a''e''u''i''o'면 모음 개수 카운트
// 공백은 스킵
// 그 외의 경우는 자음이므로 자음 개수 카운트
// 모음 개수와 자음 개수 출력
public class B11319_Count_Me_In {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문장 개수
		for (int tc = 0; tc < N; tc++) {
			char c[] = br.readLine().toLowerCase().toCharArray(); // 문자열(소문자 변환)
			int leng = c.length;
			int vo = 0; // 모음 개수
			int co = 0; // 자음 개수
			for (int i = 0; i < leng; i++) { // 문자열 길이만큼 반복
				if (c[i] == ' ') { // 공백은 넘어가기
					continue;
				} else if (c[i] == 'a' || c[i] == 'e' || c[i] == 'u' || c[i] == 'i' || c[i] == 'o') { // 모음이면
					vo++;
				} else { // 자음이면
					co++;
				}
			}
			sb.append(co).append(" ").append(vo).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}