import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 중복이 제거되어야 하므로 각 초의 상태를 저장하는 boolean배열을 사용하여 폭죽이 터지는 시간에 true저장
// Set 사용시 메모리 초과
public class B1773_폭죽쇼 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 학생 수
		int C = Integer.parseInt(s[1]); // 폭죽쇼가 끝나는 시간
		boolean num[] = new boolean[C + 1]; // 각 초의 상태를 저장하는 배열
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(br.readLine()); // 주기
			for (int j = 1; j * tmp <= C; j++) { // 주기마다 배열의 값을 true로 변경
				num[j * tmp] = true;
			}
		}
		int cnt = 0; // 폭죽이 터지는 초 개수
		for (boolean b : num) { // cnt 구하기
			if (b) {
				cnt++;
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}