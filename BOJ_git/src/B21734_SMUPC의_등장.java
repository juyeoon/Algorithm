import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/21734
// 형변환으로 문자를 정수형으로 바꾼 후 %10, /10을 이용하여 각 자리 수의 합을 구하고
// 반복문으로 합만큼 문자 출력
public class B21734_SMUPC의_등장 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char c[] = br.readLine().toCharArray(); // 주어지는 단어
		for (int i = 0; i < c.length; i++) {
			int n = (int) c[i]; // ascii 코드 값을 10진법으로
			int cnt = 0; // 각 자리 수의 합
			while (n > 0) { // 합 구하기
				cnt += n % 10;
				n /= 10;
			}
			for (int j = 0; j < cnt; j++) { // 각 자리 수의 합만큼 문자 출력
				sb.append(c[i]);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
