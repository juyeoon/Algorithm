import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// String.charAt()으로 뒤집어서 출력
public class B11365_bang_밀비_급일 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = ""; // 암호
		while (!((s = br.readLine()).equals("END"))) { // "END"가 입력될 때까지 반복
			for (int i = s.length() - 1; i >= 0; i--) { // 암호의 뒤에서부터 문자 하나씩 sb에 저장
				sb.append(s.charAt(i));
			}
			sb.append("\n"); // 한 문장 끝
		}
		System.out.println(sb); // 출력
		br.close();

	}
}