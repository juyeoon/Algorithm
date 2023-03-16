import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// String.charAt(idx)를 이용하여 문자 출력
public class B27866_문자와_문자열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine(); // 문자열
		int i = Integer.parseInt(br.readLine()); // 위치
		System.out.println(S.charAt(i - 1)); // 인덱스가 0부터 시작하므로 (위치 - 1) 문자 출력
		br.close();
	}
}