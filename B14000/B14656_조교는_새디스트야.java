import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 수를 배열에 저장한 후 (배열 인덱스 + 1)과 수가 동일한지 확인
// 동일하지 않은 수의 개수를 저장
public class B14656_조교는_새디스트야 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 수 개수
		String s[] = br.readLine().split(" "); // 입력 수
		int cnt = 0; // 동일하지 않은 수 개수
		for (int i = 0; i < N; i++) {
			if (Integer.parseInt(s[i]) != (i + 1)) { // 동일하지 않으면
				cnt++; // 카운트
			}
		}
		System.out.println(cnt); // 출력
		br.readLine();
	}
}