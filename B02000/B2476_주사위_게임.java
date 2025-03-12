import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 입력 받은 세 수를 오름차순으로 정렬한 후, 세 수의 관계에 따라 상금을 계산 후 최대 상금 갱신
public class B2476_주사위_게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 참여하는 사람 수
		int max = Integer.MIN_VALUE; // 최대 상금
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int num[] = new int[3]; // 주사위의 세 수
			for (int j = 0; j < 3; j++) { // input num[]
				num[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(num); // 주사위의 세 수를 오름차순으로 정렬
			int prize = 0; // 상금
			if (num[0] == num[2]) { // 세 수가 같을 때
				prize = num[0] * 1000 + 10000;
			} else if (num[0] != num[1] && num[1] != num[2]) { // 세 수가 모두 다를 때
				prize = num[2] * 100;
			} else { // 두 수만 같을 때 가운데 수가 같은 눈이 될 수 밖에 없음
				prize = num[1] * 100 + 1000;
			}
			max = Math.max(max, prize); // 최대 상금 갱신
		}
		System.out.println(max); // 최댓값 출력
		br.close();
	}
}