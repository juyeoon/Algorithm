import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열을 라인별로 받고(i반복) 받은 문자열을 문자하나하나 확인(j반복)하여
// 문자열에 'S'가 있으면 반복문 전체(i반복 & j반복) 탈출 후 출력
public class B30501_관공_어찌하여_목만_오셨소 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 문자열 개수
		Loop: for (int i = 0; i < N; i++) { // 입력 문자열을 라인별로 받고(i반복)
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) { // 받은 문자열을 문자하나하나 확인(j반복)
				if (s.charAt(j) == 'S') { // 문자열에 'S'가 있으면
					sb.append(s);
					break Loop; // 반복문 전체(i반복 & j반복) 탈출
				}
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}