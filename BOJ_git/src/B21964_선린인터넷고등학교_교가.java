import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// String.charAt(i)으로 N-5위치의 문자부터 N-1위치의 문자까지 출력
public class B21964_선린인터넷고등학교_교가 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문자열 길이
		String s = br.readLine(); // 입력 문자열
		for (int i = N - 5; i < N; i++) { // 5글자 출력
			sb.append(s.charAt(i));
		}
		System.out.println(sb); // 출력
		br.close();
	}
}