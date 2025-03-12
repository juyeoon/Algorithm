import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그룹 단어: 같은 종류의 문자는 연속으로 등장해아 함
// 문자가 앞에서 한 번이라도 등장했으면 그룹 단어가 아님
// 등장 판단: 뒤에 다른 문자가 등장하면(그룹의 마지막이라는 뜻) 등장으로 판단
// 배열 인덱스 접근을 위해서 마지막 문자는 따로 체크
public class B1316_그룹_단어_체커 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 단어 개수
		int cnt = 0; // 그룹 단어 개수
		for (int i = 0; i < N; i++) { // 단어 개수만큼 반복
			String s = br.readLine(); // 단어
			int leng = s.length(); // 단어 길이
			if (leng == 1) { // 단어 길이가 1이면 무조건 그룹 단어
				++cnt;
				continue; // 다음 단어로
			}
			boolean checked[] = new boolean[26]; // 알파벳이 등장했는지 확인(a:[0], ...)
			boolean groupW = true; // 그룹 단어인지 (true: 그룹 단어, false: 일반 단어)
			for (int j = 0; j < leng - 1; j++) { // 단어 길이만큼 반복
				char now = s.charAt(j); // 현재 문자
				if (checked[(int) now - 'a']) { // 현재 문자가 앞에서 한 번이라고 등장되었다 판단 될 때
					groupW = false; // 그룹 단어가 아님
					break; // 반복문 탈출
				}
				if (now != s.charAt(j + 1)) { // 뒤에 다른 문자가 등장하면(그룹의 마지막이면) 해당 문자를 등장으로 판단
					checked[(int) now - 'a'] = true; // 문자를 등장으로 기록
				}
			}
			// 마지막 문자 확인
			// 앞에서 등장되지 않았다고 판단되며 마지막 단어와 그 앞의 단어가 다르면 그룹 단어가 아님
			if (checked[(int) s.charAt(leng - 1) - 'a'] && s.charAt(leng - 2) != s.charAt(leng - 1)) {
				groupW = false;
			}
			if (groupW) { // 그룹 단어이면 카운트 증가
				++cnt;
			}
		}
		System.out.println(cnt); // 그룹 단어 개수 출력
		br.close();
	}
}
