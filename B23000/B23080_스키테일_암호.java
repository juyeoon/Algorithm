import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 암호문을 char 배열에 문자단위로 저장 후 K만큼 건너뛰면서(반복문) 문자를 연결하고 출력
public class B23080_스키테일_암호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()); // 막대의 길이
		char c[] = br.readLine().toCharArray(); // 암호문
		for (int i = 0; i < c.length; i += K) { // 막대의 길이만큼 건너뛰면서 문자를 출력에 저장
			sb.append(c[i]);
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
