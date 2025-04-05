import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/29729
// 배열의 크기와 사용 중인 원소의 수를 저장
// 저장 명령이 들어올 때 배열이 꽉 차 있으면 배열 크기를 두 배로 늘리고 원소 하나 추가
// 삭제 명령이 들어오면 원소 하나 빼기
public class B29729_가변_배열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S0 = Integer.parseInt(st.nextToken()); // 초기 최대 크기
		int N = Integer.parseInt(st.nextToken()); // 배열에 원소를 저장하는 명령의 개수
		int M = Integer.parseInt(st.nextToken()); // 배열에서 원소를 삭제하는 명령의 개수
		int S = S0; // 배열의 최대 크기
		int U = 0; // 사용 중인 원소의 수
		for (int i = 0; i < N + M; i++) {
			int command = Integer.parseInt(br.readLine()); // 명령
			if (command == 1) { // 저장 명령
				if (U == S) { // 배열이 꽉 찼으면 크기 두 배로 증가
					S *= 2;
				}
				U++; // 원소 하나 추가
			} else if (command == 0) { // 삭제 명령
				U--; // 원소 하나 삭제
			}
		}
		System.out.println(S); // 출력
		br.close();
	}
}
