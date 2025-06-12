import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26026
// 1과 1 이후의 0 2개까지 카운트 하는 문제
public class B26026_Coffee_Cup_Combo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 강의 수
		char[] s = br.readLine().toCharArray(); // 커피머신 유무
		int cnt = 0; // 커피를 마실 수 있는 강의 수
		int coffee = 0; // 마실 수 있는 커피 수
		for (int i = 0; i < n; i++) {
			if (s[i] == '1') { // 커피 머신이 있음
				cnt++; // 카운트
				coffee = 2; // 커피 개수 리셋
			} else { // 커피 머신이 없음
				if (coffee > 0) { // 커피가 있으면
					cnt++; // 카운트
					coffee--; // 커피 개수 -1
				}
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
