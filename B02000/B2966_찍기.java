import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 각각의 세 명의 찍기 방법에서 반복 패턴을 찾고 각각의 char 배열에 저장
// 정답 문자열의 문자를 하나씩 확인하면서 각각의 배열의 값(배열 인덱스: 정답의 위치%배열의 길이)을 확인하고 같으면 각각의 정답 개수 카운트
// 세 정답 개수 중 최댓값을 출력. 최댓값과 같은 사람을 (상근, 창영, 현진) 순서로 출력
public class B2966_찍기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문제 개수
		String s = br.readLine(); // 정답 문자열
		char Adrian[] = { 'A', 'B', 'C' }; // 상근이가 찍는 방법
		char Bruno[] = { 'B', 'A', 'B', 'C' }; // 창영이가 찍는 방법
		char Goran[] = { 'C', 'C', 'A', 'A', 'B', 'B' }; // 현진이가 찍는 방법
		int cntA = 0; // 상근이가 맞힌 개수
		int cntB = 0; // 창영이가 맞힌 개수
		int cntG = 0; // 현진이가 맞힌 개수
		for (int i = 0; i < N; i++) { // 문제 개수만큼 반복
			if (s.charAt(i) == Adrian[i % 3]) { // 상근이가 문제를 맞혔으면
				cntA++;
			}
			if (s.charAt(i) == Bruno[i % 4]) { // 창영이가 문제를 맞혔으면
				cntB++;
			}
			if (s.charAt(i) == Goran[i % 6]) { // 현진이가 문제를 맞혔으면
				cntG++;
			}
		}
		int max = Math.max(cntA, Math.max(cntB, cntG)); // 세 명 중 가장 많이 맞힌 문제 개수
		sb.append(max).append("\n"); // 출력 저장
		if (cntA == max) { // 상근이가 가장 많이 맞혔으면
			sb.append("Adrian\n");
		}
		if (cntB == max) { // 창영이가 가장 많이 맞혔으면
			sb.append("Bruno\n");
		}
		if (cntG == max) { // 현진이가 가장 많이 맞혔으면
			sb.append("Goran\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}