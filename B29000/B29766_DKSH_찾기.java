import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 0번째 문자부터 길이-4번째 문자까지 반복문으로 확인하여 현재~현재+3위치에 "DKSH"가 있는지 확인
public class B29766_DKSH_찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int end = s.length() - 3; // 반복문 마지막 위치
		int cnt = 0; // DKSH 개수
		for (int i = 0; i < end; i++) { // 문자열 순회
			if (s.charAt(i) == 'D') { // 현재 위치 D
				if (s.charAt(i + 1) == 'K') { // 현재+1 위치 K
					if (s.charAt(i + 2) == 'S') { // 현재+2 위치 S
						if (s.charAt(i + 3) == 'H') { // 현재+3 위치 H
							cnt++; // 카운트 갱신
							i += 3; // 3개 문자 스킵
							continue;
						}
						// "DKS"만 연속일 때
						i += 2; // 2개 문자 스킵
						continue;
					}
					// "DK"만 연속일 때
					i += 1; // 1개 문자 스킵
					continue;
				}
			}
		}
		System.out.println(cnt); // 카운트 출력
		br.close();
	}
}