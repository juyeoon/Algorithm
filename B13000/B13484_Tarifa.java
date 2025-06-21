import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/13484
// 한 달에 사용할 수 있는 데이터 = 제공 데이터 X + 이월 데이터
// 이월 데이터 = 현재 달 제공 데이터 X + 이월 데이터 - 현재 달 사용 데이터
// 출력값은 N+1개월 후 남은 데이터를 출력해야 하므로 N개월 후 이월 데이터 + 제공 데이터 X
public class B13484_Tarifa {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()); // 한달동안 사용할 수 있는 데이터(MB)
		int N = Integer.parseInt(br.readLine()); // 요금제를 사용한 개월
		int ans = 0; // 이월된 데이터
		for (int i = 0; i < N; i++) { // 데이터 이월
			ans += X - Integer.parseInt(br.readLine());
		}
		System.out.println(ans + X); // N+1개월 후 남은 데이터
		br.close();
	}
}
