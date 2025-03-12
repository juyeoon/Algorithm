import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 입력받은 주사위를 오름차순으로 정렬 후 각 조건에 맞게 if-else문으로 조건 분기 후 최댓값 갱신 
public class B2484_주사위_네개 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 참여하는 사람 수
		int max = Integer.MIN_VALUE; // 최대 상금
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int reward = 0; // 사람의 상금
			int dice[] = new int[4]; // 주사위 눈
			for (int j = 0; j < 4; j++) { // dice[] 입력
				dice[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(dice); // 주사위 눈 오름차순으로 정렬
			if (dice[0] == dice[3]) { // 같은 눈이 4개일 때 (a a a a)
				reward = 50000 + dice[0] * 5000;
			} else if (dice[0] != dice[1] && dice[1] == dice[3]) { // 같은 눈이 3개일 때(a b b b)
				reward = 10000 + dice[1] * 1000;
			} else if (dice[2] != dice[3] && dice[0] == dice[2]) { // 같은 눈이 3개일 때(a a a b)
				reward = 10000 + dice[0] * 1000;
			} else if (dice[0] == dice[1] && dice[2] == dice[3]) { // 같은 눈이 2개씩 2쌍일 때(a a b b)
				reward = 2000 + dice[0] * 500 + dice[2] * 500;
			} else if (dice[0] == dice[1]) { // 같은 눈이 2개 있을 때 (a a b c)
				reward = 1000 + dice[0] * 100;
			} else if (dice[1] == dice[2]) { // 같은 눈이 2개 있을 때(a b b c)
				reward = 1000 + dice[1] * 100;
			} else if (dice[2] == dice[3]) { // 같은 눈이 2개 있을 때(a b c c)
				reward = 1000 + dice[2] * 100;
			} else { // 모두 다른 눈일 때(a b c d)
				reward = dice[3] * 100;
			}
			max = Math.max(max, reward); // 최대 상금 갱신
		}
		System.out.println(max); // 출력
		br.close();
	}
}