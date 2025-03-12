import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 잔돈 큰 화폐단위부터 최대로 주면 개수를 최소로 만들 수 있음(그리디)
public class B5585_거스름돈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 1000 - Integer.parseInt(br.readLine()); // 거스름돈
		int cnt = 0; // 잔돈 개수
		int change[] = { 500, 100, 50, 10, 5, 1 }; // 잔돈 화폐 단위
		for (int i = 0; i < 6; i++) { // 잔돈 종류만큼 반복
			int tmp = N / change[i]; // 해당 종류를 몇 개 쓸지
			cnt += tmp; // 잔돈 개수에 추가
			N -= tmp * change[i]; // 거스름돈 갱신
		}
		System.out.println(cnt); // 잔돈 개수 출력
		br.close();
	}
}