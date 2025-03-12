import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 헬로빗이 지원하는 트랙을 저장하고 친구들의 트랙을 하나씩 확인하며 같으면 카운트 후 카운트 출력
public class B31428_엘리스_트랙_매칭 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 친구들의 수
		String s = br.readLine(); // 친구들이 지원하는 엘리스 트랙
		char hellobit = br.readLine().charAt(0); // 헬로빗이 지원하는 엘리스 트랙
		int cnt = 0; // 같은 트랙을 지원하는 친구의 수
		int idx = 0; // 반복문용 idx
		while (N > 0) { // 친구 수만큼 반복
			if (s.charAt(idx) == hellobit) { // 헬로빗과 같은 트랙이면
				cnt++; // 카운트
			}
			idx += 2;
			N--;
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}