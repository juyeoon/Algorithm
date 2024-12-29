import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/12782
// 우정 지수 = 숫자를 바꿔야 하는 개수 + (자리를 바꿔야 하는 개수 / 2)
// = |(N의 1의 개수 - M의 1의 개수)| + (값이 다른 자리 수 개수 - 숫자를 바꿔야 하는 개수) / 2
public class B12782_비트_우정지수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char N[] = st.nextToken().toCharArray(); // 첫번째 이진수
			char M[] = st.nextToken().toCharArray(); // 두번째 이진수
			int cntOneN = 0; // 첫번째 이진수의 1의 개수
			int cntOneM = 0; // 두번째 이진수의 1의 개수
			int diffCnt = 0; // 같은 자리 수의 값이 다른 자리 수의 개수
			for (int i = 0; i < M.length; i++) { // 각 변수 값 구하기
				if (N[i] == '1') {
					cntOneN++;
				}
				if (M[i] == '1') {
					cntOneM++;
				}
				if (N[i] != M[i]) {
					diffCnt++;
				}
			}
			// 우정 지수 = 숫자를 바꿔야 하는 개수 + (자리를 바꿔야 하는 개수 / 2)
			sb.append(Math.abs(cntOneN - cntOneM) + (diffCnt - Math.abs(cntOneN - cntOneM)) / 2).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
