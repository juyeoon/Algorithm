import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1번, 2번, 3번역을 출발했을 때의 승객 수(타고 있던 승객 수 - 내리는 승객 수 + 타는 승객 수)를 구한 후 최댓값을 구함
public class B2455_지능형_기차 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		st.nextToken(); // 처음 숫자는 무조건 0이므로 생략
		int now = Integer.parseInt(st.nextToken()); // 역을 출발했을 때의 승객 수
		int max = now; // 최대 승객 수(이 시점에선 1번 역을 출발했을 때의 승객 수)
		for (int i = 0; i < 2; i++) { // 마지막 줄은 생략해도 되므로 두번째 줄, 세번째 줄만 계산
			st = new StringTokenizer(br.readLine());
			now = now - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()); // 해당 역을 출발했을 때의 승객 수
			max = Math.max(max, now); // 최대 승객 수 갱신
		}
		System.out.println(max); // 출력
		br.close();
	}
}