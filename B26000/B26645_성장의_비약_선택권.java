import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26645
// 각 비약에 개수, 레벨 제한이 있을 때 가장 많이 레벨업을 할 수 있는 비약을 선택하는 문제
// 모든 비약에 대해서 가능한 최대 레벨을 찾아서 최대 레벨끼리 비교
// 동률일 경우 번호가 큰 것을 우선 선택
public class B26645_성장의_비약_선택권 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 캐릭터의 현재 레벨
		int[] amount = { 8, 4, 2, 1 }; // 각 비약의 개수
		int[] maxLevel = { 209, 219, 229, 239 }; // 각 비약의 사용 가능 최대 레벨
		int bestLevel = N; // 가장 높은 도달 레벨
		int bestPotion = 0; // 가장 좋은 비약의 인덱스
		for (int i = 0; i < 4; i++) { // 4종류 비약에 대해 반복
			int nowLevel = N; // 현재 비약에 대한 예상 레벨
			int useCnt = 0; // 해당 비약을 사용한 횟수
			// 비약의 개수만큼 반복해서 사용할 수 있는지 체크
			while (useCnt < amount[i] && nowLevel >= 200 && nowLevel <= maxLevel[i]) {
				nowLevel++;
				useCnt++;
			}
			// 더 높은 레벨에 도달했거나, 같은 경우 아래에 있는 비약(i가 더 큰 것) 선택
			if (nowLevel > bestLevel || (nowLevel == bestLevel && i > bestPotion)) {
				bestLevel = nowLevel;
				bestPotion = i;
			}
		}

		System.out.println(bestPotion + 1); // 출력
		br.close();
	}
}
