import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 브루트포스 알고리즘으로 1000부터 9999까지 10진수와 12진수와 16진수의 자리수의 합이 같은 수를 찾기
// K의 n진수의 자리수의 합 => K를 n으로 나눈 나머지를 더함. K를 n으로 나눔 (K가 0보다 클 때까지 반복)
public class B6679_싱기한_네자리_숫자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int i = 1000; i <= 9999; i++) { // 1000부터 9999까지 확인
			int sum10 = 0; // 10진수 자리수의 합
			int sum12 = 0; // 12진수 자리수의 합
			int sum16 = 0; // 16진수 자리수의 합
			for (int j = i; j > 0; j /= 10) { // sum10 구하기
				sum10 += j % 10;
			}
			for (int j = i; j > 0; j /= 12) { // sum12 구하기
				sum12 += j % 12;
			}
			for (int j = i; j > 0; j /= 16) { // sum16 구하기
				sum16 += j % 16;
			}
			if (sum10 == sum12 && sum12 == sum16) { // 세 수가 같으면
				sb.append(i).append("\n"); // 출력에 추가
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}