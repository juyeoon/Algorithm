import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A가 1이고 Z가 26일 때 문자를 숫자로, 숫자를 문자로 변환하기 
// 문자 -> 숫자 : 'A'가 1이므로 현재 문자에 'A'를 빼서 'A'가 0일때의 숫자를 구한 후 1을 더해주기
// 숫자 -> 문자: 1이 'A'이므로 현재 숫자에 'A'를 더해서 'A'가 0일때의 문자를 구한 후 1을 빼고 char형으로 변환
public class B12778_CTP공국으로_이민_가자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken()); // 시험 문제의 길이
			char C = st.nextToken().charAt(0); // 문자 or 숫자(C or N)
			st = new StringTokenizer(br.readLine()); // 변환 문자열
			for (int i = 0; i < M; i++) { // 변환 문자 수만큼 반복
				if (C == 'C') { // 문자 -> 숫자 : 'A'가 1이므로 현재 문자에 'A'를 빼서 'A'가 0일때의 숫자를 구한 후 1을 더해주기
					sb.append(st.nextToken().charAt(0) - 'A' + 1).append(" ");
				} else { // 숫자 -> 문자: 1이 'A'이므로 현재 숫자에 'A'를 더해서 'A'가 0일때의 문자를 구한 후 1을 빼고 char형으로 변환
					sb.append((char) (Integer.parseInt(st.nextToken()) + 'A' - 1)).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}