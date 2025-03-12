import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/25641
// 현재 소떡소떡에 있는 s와 t의 개수를 구한 후
// 맨 앞의 것을 빼는 작업을 두 종류의 개수가 같아질 때까지 반복
public class B25641_균형_잡힌_소떡소떡 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 소떡소떡의 길이
		char c[] = br.readLine().toCharArray(); // 소떡소떡 구성
		int sCnt = 0; // 소시지 개수
		int tCnt = 0; // 떡 개수
		for (int i = 0; i < N; i++) { // 개수 세기
			if (c[i] == 's') {
				sCnt++;
			} else {
				tCnt++;
			}
		}
		int startIdx = 0; // 떼내야할 것의 종류
		while (sCnt != tCnt) { // 개수가 같아질 때까지 반복
			if (c[startIdx] == 's') {
				sCnt--;
			} else {
				tCnt--;
			}
			startIdx++;
		}
		for (int i = startIdx; i < N; i++) { // 떼네지 않은 것부터 출력 저장
			sb.append(c[i]);
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
