import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열의 문자를 하나씩 확인하면서 등장 알파벳의 개수를 세고
// 알파벳 개수 배열을 돌면서 등장 횟수 최댓값, 최댓값을 가지는 알파벳, 최댓값을 가지는 알파벳의 개수를 구함
// 최댓값을 가지는 알파벳 수가 2 이상이면 ? 출력, 하나면 최댓값을 가지는 알파벳 출력
public class B9046_복호화 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int alphaCnt[] = new int[26]; // 알파벳 개수
			char c[] = br.readLine().toCharArray(); // 입력문자열
			for (int i = 0; i < c.length; i++) { // 알파벳 개수 세기
				if (c[i] != ' ') { // 공백이 아닐때만 세기
					alphaCnt[c[i] - 'a']++;
				}
			}
			int max = -1; // 최대 개수
			int maxIdx = -1; // 최대 개수는 가지는 알파벳의 인덱스
			int maxCnt = 1; // 최댓값을 가지는 알파벳의 종류의 개수
			for (int i = 0; i < 26; i++) { // 알파벳 종류만큼 반복
				if (max < alphaCnt[i]) { // 현재 최댓값보다 크면 갱신
					max = alphaCnt[i];
					maxIdx = i;
					maxCnt = 1;
				} else if (max == alphaCnt[i]) { // 현재 최댓값이랑 같으면
					maxCnt++; // 최댓값 개수 증가
				}
			}
			if (maxCnt > 1) { // 최댓값이 중복이면
				sb.append("?\n");
			} else { // 최댓값이 하나면
				sb.append((char) (maxIdx + 'a')).append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}