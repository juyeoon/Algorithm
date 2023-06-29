import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// boolean 배열을 사용하여 열림 닫힘 여부를 확인
// 라운드마다 배수 위치의 값을 반대로 저장
public class B6359_만취한_상범 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine()); // 라운드
			boolean close[] = new boolean[n + 1]; // 닫힘 여부(true: 닫힘, false: 열림) (1라운드 진행 후 상태)
			for (int i = 2; i <= n; i++) { // 2라운드부터 n라운드까지
				for (int j = i; j <= n; j += i) { // 라운드 배수
					close[j] = !close[j]; // 열고 닫기
				}
			}
			int cnt = 0; // 열린 감옥 개수
			for (int i = 1; i <= n; i++) { 
				if (!close[i]) { // 열리면
					cnt++; // 카운트
				}
			}
			sb.append(cnt).append("\n"); 
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}