import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/8371
// 원본 텍스트와 베낀 텍스트를 각각 입력 받고 순회하면서 다른 문자의 수를 카운트 하는 문제
public class B8371_Dyslexia {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] original = br.readLine().toCharArray(); // 원본 텍스트
		char[] copied = br.readLine().toCharArray(); // 베낀 텍스트
		int cnt = 0; // 다른 문자 개수
		for (int i = 0; i < n; i++) {
			if (original[i] != copied[i]) { // 문자가 다르면 카운트
				cnt++;
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
