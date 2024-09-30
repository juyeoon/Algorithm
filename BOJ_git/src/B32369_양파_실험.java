import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 단순 시뮬레이터 구현
public class B32369_양파_실험 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 실험 진행일
		int A = Integer.parseInt(st.nextToken()); // 양파에 칭찬하면 자라는 길이
		int B = Integer.parseInt(st.nextToken()); // 양파에 비난하면 자라는 길이
		int goodO = 1; // 칭찬 양파 현재 길이
		int badO = 1; // 비난 양파 현재 길이
		for (int i = 0; i < N; i++) { // N일 반복
			goodO += A; // 칭찬 양파 성장
			badO += B; // 비난 양파 성장
			if (badO > goodO) { // 비난 양파 길이가 더 길면 swap
				int tmp = goodO;
				goodO = badO;
				badO = tmp;
			} else if (badO == goodO) { // 길이가 같으면 비난 양파 1만큼 자르기
				badO--;
			}
		}
		System.out.println(goodO + " " + badO); // 출력
		br.close();
	}
}