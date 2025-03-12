import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5751
// 0과 1의 개수를 구하는 문제
// 입력된 수를 다 더하면 1의 개수, 전체 개수에서 1의 개수를 빼면 0의 개수
public class B5751_Head_or_Tail {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 테스트케이스
		while (N != 0) { // EOI
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = 0; // 전체를 합한 값
			for (int i = 0; i < N; i++) { // cnt 구하기
				cnt += Integer.parseInt(st.nextToken());
			}
			sb.append("Mary won ").append(N - cnt).append(" times and John won ").append(cnt).append(" times\n"); // 출력 저장
			N = Integer.parseInt(br.readLine());
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
