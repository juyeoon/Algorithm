import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// T가 마이너스가 될 때까지 입력값 빼고 뺀 횟수 출력
public class B10409_서버 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]); // 수행시간 개수 n
		int T = Integer.parseInt(s[1]); // 처리 최대 시간 T
		s = br.readLine().split(" ");
		int cnt = 0; // 완료될 수 있는 일의 개수
		while (T >= 0 && cnt < n) { // 처리 최대 시간을 넘지 않았을 때 && 횟수가 개수를 넘지 않을 때 반복
			T -= Integer.parseInt(s[cnt]); // 처리시간에 수행 시간 빼기
			cnt++; // 카운트
		}
		// 끝났을 때 T가 음수면 카운트 하나 빼기
		System.out.println(T < 0 ? cnt - 1 : cnt); // 출력
		br.readLine();
	}
}