import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 길이가 N이면서 수미상관이면서 팰린드롬인 문자열은 하나의 문자가 N개 반복되는 문자열  
public class B20944_팰린드롬_척화비 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문자열의 길이
		for (int i = 0; i < N; i++) { // 'a'를 N개 붙이기
			sb.append('a');
		}
		System.out.println(sb); // 출력
		br.close();
	}
}