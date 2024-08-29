import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력받은 문자열을 모두 소문자로 전환 후 문자 배열로 변경
// 알파벳마다의 등장 여부를 확인하는 배열을 사용. boolean 배열(idx: 알파벳 번호, true: 등장)
// 문자 배열을 순회하여 알파벳을 숫자로 변환 후 (a: 0, b: 1, ...) 인덱스로 사용 
// 알파벳 등장 여부 배열을 순회하면서 등장한 알파벳 개수 카운트 후 출력
public class B7600_문자가_몇갤까 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("#")) { // EOI
			char c[] = s.toLowerCase().toCharArray(); // 입력 받은 문자열을 소문자로 변경 후 문자 배열로 변경
			boolean alpha[] = new boolean[26]; // 알파벳 등장 여부
			int end = c.length; // 반복문 종료 조건
			for (int i = 0; i < end; i++) {
				int idx = c[i] - 'a'; // alpha 배열의 인덱스
				if (idx >= 0 && idx < 26) { // 알파벳에 해당하면
					alpha[idx] = true; // 등장 여부 표시
				}
			}
			int cnt = 0; // 등장 알파벳 개수
			for (boolean b : alpha) { // 알파벳이 등장했으면 카운트
				if (b)
					cnt++;
			}
			sb.append(cnt).append("\n"); // 카운트 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}