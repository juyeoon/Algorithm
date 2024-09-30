import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 'x' 위치 찾기 => 첫 번째 문자열을 소문자로 변환(toLowerCase()) -> 'x' 위치 찾기 -> indexOf()
// 해당 위치의 문자 찾기 => 두 번째 문자열의 idx에 해당하는 문자 찾기 -> 소문자면 대문자로 변환(아스키코드)
public class B30877_X_marks_the_Spot {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문자열 쌍의 개수
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int idx = st.nextToken().toLowerCase().indexOf('x'); // 첫 번째 문자열 Si에서 'x' or 'X' 등장 위치
			char c = st.nextToken().charAt(idx); // 두 번째 문자열 Ti에서 같은 등장 위치의 문자
			if (c >= 97) { // 문자가 소문자면
				c -= 97 - 65; // 대문자롭 변경
			}
			sb.append(c); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}