import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34553
public class B34553_알파벳_점수_계산기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int leng = s.length();
		int score = 1; // 총 점수
		int nowScore = 1; // 현재 점수
		for (int i = 1; i < leng; i++) {
			if (s.charAt(i - 1) < s.charAt(i)) { // 점수 증가 조건
				nowScore += 1;
			} else { // 그 외
				nowScore = 1; // 점수 리셋
			}
			score += nowScore; // 점수 더하기
		}
		System.out.println(score); // 출력
		br.close();
	}
}
