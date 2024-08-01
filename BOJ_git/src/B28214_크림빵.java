import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 묶음별로 크림이 없는 빵의 개수를 세고 그 개수가 판매기준보다 적으면 카운트 후 카운트 출력
public class B28214_크림빵 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 묶음 개수
		int K = Integer.parseInt(st.nextToken()); // 한 묶음의 빵 개수
		int P = Integer.parseInt(st.nextToken()); // 판매 기준(크림 없는 빵 개수)
		int cnt = 0; // 팔 수 있는 묶음의 개수
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // 묶음
			int zeroCnt = 0; // 크림이 없는 빵의 개수
			for (int j = 0; j < K; j++) { // 빵
				if (Integer.parseInt(st.nextToken()) == 0) { // 크림이 없는 빵 개수 세기
					zeroCnt++;
				}
			}
			if (zeroCnt < P) { // 팔 수 있으면
				cnt++; // 카운트
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
