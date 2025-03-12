import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 등장 횟수를 저장하는 배열을 이용하여 등장 횟수 저장
// 배열을 순회하여 최대 횟수를 찾은 후 다시 배열을 순회하여 최대 횟수와 같은 횟수를 가지는 알파벳 출력
public class B1371_가장_많은_글자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int alphabet[] = new int[26]; // 알파벳 등장 횟수 저장하는 배열
		String s = "";
		while ((s = br.readLine()) != null) { // EOF
			int leng = s.length();
			for (int i = 0; i < leng; i++) {
				if (s.charAt(i) == ' ') { // 공백 뛰어넘기
					continue;
				}
				alphabet[s.charAt(i) - 'a']++; // 횟수 갱신
			}
		}
		int max = 0; // 최대 횟수
		for (int i = 0; i < alphabet.length; i++) { // 최대 횟수 찾기
			max = Math.max(max, alphabet[i]);
		}
		for (int i = 0; i < alphabet.length; i++) { // 최대 횟수를 가지는 알파벳 찾기
			if (alphabet[i] == max) {
				sb.append((char) (i + 'a')); // 누적해서 알파벳 출력
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}