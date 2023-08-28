import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 공의 위치를 저장하는 boolean 배열을 사용. 배열[0] = true
// 입력 문자에 맞게 배열의 요소를 스위치
// true인 인덱스에 1을 더하여 출력
public class B3028_창영마을 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		boolean cup[] = new boolean[3]; // 공의 위치 저장
		cup[0] = true; // 가장 왼쪽에 공
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A') { // A 입력 -> 0,1 스위치
				boolean tmp = cup[0];
				cup[0] = cup[1];
				cup[1] = tmp;
			} else if (c == 'B') { // B 입력 -> 1,2 스위치
				boolean tmp = cup[1];
				cup[1] = cup[2];
				cup[2] = tmp;
			} else { // C 입력 -> 0,2 스위치
				boolean tmp = cup[0];
				cup[0] = cup[2];
				cup[2] = tmp;
			}
		}
		int ans = 0; // 공의 위치
		for (int i = 0; i < cup.length; i++) { // true인 인덱스 찾기
			if (cup[i]) {
				ans = i;
			}
		}
		System.out.println(++ans); // 출력
		br.close();
	}
}