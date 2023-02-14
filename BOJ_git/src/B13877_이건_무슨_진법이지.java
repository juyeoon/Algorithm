import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10진수를 각각 8진수, 10진수, 16진수로 해석했을 때의 값(10진수)을 출력
// 입력에 8 및 9가 있으면 8진수로 해석될 수 없음 (16진수는 상관 없음)
// 10진수 출력 시 앞의 0 떼고 출력
public class B13877_이건_무슨_진법이지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			sb.append(st.nextToken()).append(" "); // 테스트 데이터 번호 출력 추가
			String s = st.nextToken(); // 데이터
			long oc = 0; // 8진법 수
			long he = 0; // 16진법 수
			int idx = 0; // 자리 번호
			boolean noOc = false; // true: 8진수로 해석될 수 없음
			for (int i = s.length() - 1; i >= 0; i--) { // 일의 자리 수 부터 확인
				int tmp = (int) s.charAt(i) - '0'; // 자리 수
				if (tmp >= 8) { // 8, 9면 8진수로 해석될 수 없음
					noOc = true;
				}
				if (!noOc) { // 8진수로 해석될 수 있으면
					oc += tmp * Math.pow(8, idx); // 8진수으로 해석하여 계산
				}
				he += tmp * Math.pow(16, idx); // 16진수로 해석하여 계산
				idx++; // 자리 수 갱신
			}
			if (noOc) { // 8진수로 해석될 수 없으면
				oc = 0; // 0 출력
			}
			// 10진수는 앞의 0을 제거한 후 입력 문자열을 출력
			sb.append(oc).append(" ").append(s.replaceFirst("^0+(?!$)", "")).append(" ").append(he).append("\n"); // 데이터 출력																						// 추가
		}
		System.out.println(sb); // 출력
		br.close();
	}
}