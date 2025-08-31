import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26201
// 연속된 같은 문자 구간(run)을 찾아내고, 그 중에서 'a'로만 구성된 길이 2 이상 구간의 문자 개수를 모두 합산
public class B26201_Finding_Maximal_Non_Trivial_Monotones {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 문자열 길이 N
		String s = br.readLine();
		long ans = 0; // 조건을 만족하는 'a'의 개수
		int runLen = 0; // 현재 연속된 문자(run)의 길이
		char prev = '\0'; // 직전 run의 문자
		for (int i = 0; i < N; i++) {
			char c = s.charAt(i); // 현재 위치의 문자
			if (i == 0) { // 첫 번째 문자인 경우
				prev = c; // 현재 문자를 run의 기준 문자로 저장
				runLen = 1; // run 길이는 1로 초기화
			} else if (c == prev) { // 이전 문자와 현재 문자가 같으면
				runLen++; // run 길이를 1 증가시킴
			} else { // 이전 문자와 다르면 run이 끊어짐
				if (prev == 'a' && runLen >= 2) { // 이전 run이 'a'로만 이루어져 있고 길이가 2 이상이면
					ans += runLen; // 해당 run 길이만큼 정답에 더함
				}
				prev = c; // 새로운 run의 기준 문자를 현재 문자로 갱신
				runLen = 1; // run 길이를 1로 초기화
			}
		}
		if (prev == 'a' && runLen >= 2) { // 마지막 run이 'a'이고 길이가 2 이상이면
			ans += runLen; // run 길이만큼 정답에 더함
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
