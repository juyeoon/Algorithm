import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25841
// 주어진 범위의 수를 문자열로 변환해 특정 숫자가 등장한 총 횟수 세기
public class B25841_Digit_Count {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken()); // 시작 숫자
		int end = Integer.parseInt(st.nextToken()); // 끝 숫자
		char target = st.nextToken().charAt(0); // 찾을 숫자
		int cnt = 0; // 등장한 횟수
		for (int i = start; i <= end; i++) {
			String num = String.valueOf(i); // 문자열로 변환
			for (int j = 0; j < num.length(); j++) { // 각 자리 수 순회
				if (num.charAt(j) == target) {
					cnt++;
				}
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
