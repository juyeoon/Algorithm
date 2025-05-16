import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/30957
// 각 분야를 선택한 학생의 수를 센 후 최댓값 찾기
// 세 분야의 값이 모두 같으면 "SCU" 출력
// 최댓값이랑 같은 분야를 "BSA" 순서로 출력
public class B30957_빅데이터_vs_정보보호_vs_인공지능 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 학생의 수
		char c[] = br.readLine().toCharArray(); // 입력받은 답
		int bCnt = 0; // B 개수
		int sCnt = 0; // S 개수
		int aCnt = 0; // A 개수
		for (int i = 0; i < N; i++) { // BSA 개수 세기
			if (c[i] == 'B') {
				bCnt++;
			} else if (c[i] == 'S') {
				sCnt++;
			} else {
				aCnt++;
			}
		}
		int maxCnt = Math.max(bCnt, Math.max(sCnt, aCnt)); // 최댓값
		if (bCnt == sCnt && sCnt == aCnt) { // 세 분야의 관심이 동일
			sb.append("SCU");
		} else { // 최댓값이랑 동일한 분야 출력
			if (bCnt == maxCnt) {
				sb.append("B");
			}
			if (sCnt == maxCnt) {
				sb.append("S");
			}
			if (aCnt == maxCnt) {
				sb.append("A");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
