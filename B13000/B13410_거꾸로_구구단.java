import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N*2부터 N*K까지 곱해서 뒤집은 후 최댓값과 비교 후 최댓값 구하기
public class B13410_거꾸로_구구단 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 단의 수
		int K = Integer.parseInt(s[1]); // 항의 수
		int max = N; // 최댓값(초기값: 1항의 값)
		for (int i = 2; i <= K; i++) { // 2항부터 K항까지
			int ori = N * i; // N * i 값 (원래 값)
			int reverse = 0; // 뒤집은 값
			while (ori > 0) { // 숫자 뒤집기
				int tmp = ori % 10;
				reverse = reverse * 10 + tmp;
				ori /= 10;
			}
			max = Math.max(max, reverse); // 최댓값 갱신
		}
		System.out.println(max); // 출력
		br.close();
	}
}