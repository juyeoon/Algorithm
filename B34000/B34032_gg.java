import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34032
// 항복 여부를 입력 받아 항복한 사람의 수를 셈
// 항복한 사람 * 2가 전체 사람 수 이상이면 항복, 그렇지 않으면 항복하지 않음
public class B34032_gg {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 팀원의 수
		char[] S = br.readLine().toCharArray(); // 항복 여부
		int surrener = 0; // 항복한 사람의 수
		for (int i = 0; i < N; i++) { // 항복한 사람 수 세기
			if (S[i] == 'O') {
				surrener++;
			}
		}
		System.out.println((surrener * 2 >= N) ? "Yes" : "No"); // 항복한 사람이 과반수 이상이면 항복
		br.close();
	}
}
