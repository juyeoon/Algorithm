import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 문자열을 String.split(" ")을 이용하여 공백으로 나누어 배열에 저장하고 배열을 뒤에서부터 출력
public class B12605_단어순서_뒤집기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Case #").append(tc).append(": "); // 출력문
			String s[] = br.readLine().split(" "); // 공백으로 문자열 나누기
			int leng = s.length - 1;
			for (int i = leng; i >= 0; i--) { // 문자열의 단어를 뒤에서부터 출력
				sb.append(s[i]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}