import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/15179
// 시뮬레이션 구현
public class B15179_Golf_Croquet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String team1 = br.readLine(); // 1번 팀 이름
		String team2 = br.readLine(); // 2번 팀 이름
		int S = Integer.parseInt(br.readLine()); // 횟수
		char[] code = br.readLine().toCharArray(); // 샷의 결과
		int[] score = new int[2]; // 두 팀의 점수
		int turn = 0; // 현재 차례인 팀
		for (int i = 0; i < S; i++) {
			switch (code[i]) {
			case 'S':
				break;
			case 'H': // 현재 팀 +1점
				score[turn] = Math.min(score[turn] + 1, 7);
				break;
			case 'D': // 현재 팀 +2점
				if (score[turn] == 6) {
					score[turn] = 7;
				} else {
					score[turn] = Math.min(score[turn] + 2, 7);
				}
				break;
			case 'O': // 상대 팀 +1점
				score[turn ^ 1] = Math.min(score[turn ^ 1] + 1, 7);
				break;
			}
			if (score[0] == 7 || score[1] == 7) { // 경기 종료 조건
				break;
			}
			turn ^= 1; // 차례 바꾸기
		}
		// 출력 저장
		sb.append(String.format("%s %d %s %d. ", team1, score[0], team2, score[1]));
		if (score[0] == 7 || score[1] == 7) { // 7점 도달 팀 존재
			sb.append(String.format("%s has won.", score[0] == 7 ? team1 : team2));
		} else if (score[0] == score[1]) { // 점수가 같음
			sb.append("All square.");
		} else { // 그 외
			sb.append(String.format("%s is winning.", score[0] > score[1] ? team1 : team2));
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
