import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/27222
// 역도 선수는 자신의 체중 변화를 분석하여 훈련을 통해 증가한 근육량을 계산
// 훈련한 날 (i번째 숫자가 1) 중 저녁 체중이 아침 체중보다 증가한 경우 증가량을 합산하여 출력
public class B27222_Штангист {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 분석할 일수
		String train[] = br.readLine().split(" "); // 훈련 여부
		int sum = 0; // 체중 증가량 합산
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int before = Integer.parseInt(st.nextToken()); // 이전 체중
			int after = Integer.parseInt(st.nextToken()); // 이후 체중
			if (Integer.parseInt(train[i]) == 1 && before < after) { // 조건에 맞으면
				sum += after - before; // 합산
			}
		}
		System.out.println(sum); // 출력
		br.close();
	}
}
