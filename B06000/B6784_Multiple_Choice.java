import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/6784
// 학생의 답안과 실제 정답을 배열에 저장한 후 같은 인덱스의 값을 비교하여 같으면 카운트 후 카운트 출력
public class B6784_Multiple_Choice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 문제 개수
		char[] stuAns = new char[N]; // 학생의 답안
		char[] answer = new char[N]; // 실제 정답
		for (int i = 0; i < N; i++) { // stuAns[] 채우기
			stuAns[i] = br.readLine().charAt(0);
		}
		for (int i = 0; i < N; i++) { // answer[] 채우기
			answer[i] = br.readLine().charAt(0);
		}
		int cnt = 0; // 정답인 문제 개수
		for (int i = 0; i < N; i++) {
			if (stuAns[i] == answer[i]) { // 정답이면 카운트
				cnt++;
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
