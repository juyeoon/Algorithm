import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 세 글자를 char 배열에 넣은 후 뒤에서부터 출력
public class B8545_Zadanie_probne {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] c = br.readLine().toCharArray(); // 문자열의 세 문자
		for (int i = c.length - 1; i >= 0; i--) { // 뒤에서부터 출력
			sb.append(c[i]);
		}
		System.out.println(sb);
		br.close();
	}
}
