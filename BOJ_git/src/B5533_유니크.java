import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 각 게임마다 인덱스가 카드 번호고 값이 해당 카드를 가진 사람인 수를 저장하는 배열을 사용하여 해당 카드를 몇명이 가졌는지 저장 후
// 해당 카드를 인덱스로 넣었을 때 배열의 값이 1이면 점수에 더하여 점수 구하기
public class B5533_유니크 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 참가자의 수
		int num[][] = new int[N][3]; // 참가자가 쓴 수
		for (int i = 0; i < N; i++) { // num[][] 채우기
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int score[] = new int[N]; // 참가자의 점수의 합
		for (int i = 0; i < 3; i++) { // 1,2,3번째 게임
			int dup[] = new int[101]; // 카드를 가진 사람의 수(인덱스: 카드 번호)
			for (int j = 0; j < N; j++) { // dup[] 채우기
				dup[num[j][i]]++;
			}
			for (int j = 0; j < N; j++) { // i번째 게임 점수 구하기
				if (dup[num[j][i]] == 1) { // 혼자 해당 카드를 뽑았으면
					score[j] += num[j][i]; // 점수에 추가
				}
			}
		}
		for (int i : score) { // 점수 출력 저장
			sb.append(i).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
