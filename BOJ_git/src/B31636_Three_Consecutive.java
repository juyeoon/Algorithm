import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열에 'o'가 연속으로 3개("ooo") 존재하는지 확인하는 문제
// 연속된 'o'의 개수를 저장하는 `cnt`를 사용하여
// 'o'가 등장하면 cnt+1
// 'x'가 등장하면 cnt 리셋
// cnt가 3이 되면 반복문 탈출 후 "Yes"출력. 그 외는 "No" 출력
public class B31636_Three_Consecutive {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 문자열 길이
		String s = br.readLine(); // 입력 문자열
		int cnt = 0; // 연속된 'o'의 개수
		boolean threeO = false; // "ooo" 존재 여부(true: 존재)
		for (int i = 0; i < N; i++) {
			if (s.charAt(i) == 'o') { // 현재 문자가 'o'이면
				cnt++; // 카운트 + 1
			} else { // 현재 문자가 'x'이면
				cnt = 0; // 카운트 리셋
			}
			if (cnt == 3) { // 카운트가 3이 되면
				threeO = true; // "ooo" 존재
				break;
			}
		}
		System.out.println(threeO ? "Yes" : "No"); // 출력
		br.close();
	}
}