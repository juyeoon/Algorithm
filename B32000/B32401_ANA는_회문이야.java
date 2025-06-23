import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32401
// 현재 문자가 A면 다음 A의 위치를 찾으며 그 사이 N이 몇 개인지 확인
// 다음 A를 찾고 N이 1개고 길이가 3 이상이면 카운트 후 현재 문자를 다음 A의 위치로 이동
public class B32401_ANA는_회문이야 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 문자열 길이
		char[] s = br.readLine().toCharArray(); // 문자열
		int cnt = 0; // 유사 ANA 개수
		int now = 0; // 현재 위치
		int end = 0; // 확인할 문자열의 마지막 문자 위치
		while (now < N && end < N) { // 문자열 전체 순회
			if (s[now] != 'A') { // 현재 문자가 A가 아니면 스킵
				now++;
			} else { // 현재 문자가 A면
				int nCnt = 0; // 다음 A가지의 N의 개수
				end = now + 1; // 다음 A를 찾기 위한 인덱스
				while (end < N && s[end] != 'A') { // 다음 A가 나올 때까지 확인
					if (s[end] == 'N') { // N 개수 세기
						nCnt++;
					}
					end++;
				}
				if (end < N && nCnt == 1 && end - now >= 2) { // 유사 ANA의 조건에 맞으면 카운트
					cnt++;
				}
				now = end; // 현재 위치를 다음 A의 위치로 갱신
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
