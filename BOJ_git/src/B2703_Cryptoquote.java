import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2703
// 변환 규칙을 char 배열에 저장 후 암호문을 인덱스로 바꿔서 출력문에 추가
public class B2703_Cryptoquote {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			String s = br.readLine(); // 암호 메시지
			char cryp[] = br.readLine().toCharArray(); // 변환 규칙
			int leng = s.length();
			for (int i = 0; i < leng; i++) { // 변환
				if (s.charAt(i) == ' ') { // 공백 스킵
					sb.append(" ");
				} else { // 변환
					sb.append(cryp[s.charAt(i) - 'A']);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
