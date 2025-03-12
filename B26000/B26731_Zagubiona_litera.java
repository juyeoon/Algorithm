import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A~Z 중 없는 문자 찾는 문제
// [26] 크기의 boolean 배열에 등장 여부 저장 ([0]: 'A', ... [25]: 'Z')
// 등장하면 해당 인덱스를 true로 변경
// 다시 배열을 순회하면서 false인 인덱스를 찾고 (char)(인덱스 + 'A')로 변형하여 문자 출력
public class B26731_Zagubiona_litera {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 문자열
		boolean alphabet[] = new boolean[26]; // 알파벳 등장 여부 저장(true: 등장)
		for (int i = 0; i < 25; i++) { // alphabet[] 채우기
			alphabet[s.charAt(i) - 'A'] = true;
		}
		for (int i = 0; i < 26; i++) { // 빈 문자 찾고 출력
			if (!alphabet[i]) {
				System.out.println((char) (i + 'A'));
				break;
			}
		}
		br.close();
	}
}