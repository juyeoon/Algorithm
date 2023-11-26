import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력 문자열에서 제거할 부분의 앞쪽(0~i-1)과 뒷쪽 문자열(j~)을 합쳐서 출력
public class B26546_Reverse {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 입력 라인 수
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken(); // 입력 문자열 
			int i = Integer.parseInt(st.nextToken()); // 제거할 하위 문자열의 시작 인덱스
			int j = Integer.parseInt(st.nextToken()); // 제거할 하위 문자열의 마지막 인덱스 다음 인덱스
			for (int n = 0; n < i; n++) { // 제거 문자열의 앞쪽 문자열
				sb.append(s.charAt(n));
			}
			for (int n = j; n < s.length(); n++) { // 제거 문자열의 뒷쪽 문자열
				sb.append(s.charAt(n));
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}