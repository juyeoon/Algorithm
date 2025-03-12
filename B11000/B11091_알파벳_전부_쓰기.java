import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열을 숫자로 변환한 뒤(a==0), 0~25 사이면 알파벳이므로 등장 여부 저장
// 알파벳 등장 여부 배열을 순회하면서 등장하지 않은 문자열을 저장 후 출력
// 모두 다 등장했으면 팬그램
public class B11091_알파벳_전부_쓰기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 문자열 개수
		for (int i = 0; i < N; i++) {
			String s = br.readLine().toLowerCase(); // 입력 문자열 모두 소문자로 변환
			boolean[] alpha = new boolean[26]; // 알파벳 등장 여부 저장
			int end = s.length(); // 문자열 길이(반복문 종료 조건)
			for (int j = 0; j < end; j++) { // 문자열 문자 순회
				int idx = s.charAt(j) - 'a'; // 현재 문자를 숫자로 변환(a: 0, b: 1, ... , z: 25)
				if (idx >= 0 && idx < 26) { // 현재 문자가 알파벳이면
					alpha[idx] = true; // 등장여부 갱신
				}
			}
			boolean pangram = true; // 팬그램 여부
			String missing = ""; // 등장하지 않은 알파벳의 나열
			for (int j = 0; j < 26; j++) { // 알파벳 등장 여부 배열 순회
				if (!alpha[j]) { // 등장하지 않았으면
					pangram = false; // 팬그림이 아님
					missing += (char) (j + 'a'); // 등장하지 않은 문자에 추가
				}
			}
			if (pangram) { // 팬그램이면
				sb.append("pangram");
			} else { // 팬그램이 아니면
				sb.append("missing ").append(missing);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}