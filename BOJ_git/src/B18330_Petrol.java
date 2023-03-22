import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 60 Oshloobs가 지원되기 때문에 (60 + 연료 카드에 남아있는 양)은 1500 그 외의 양은 3000
public class B18330_Petrol {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 다음 달 사용할 휘발유 양
		int k = Integer.parseInt(br.readLine()); // 연료 카드에 남아있는 양
		System.out.println((k + 60 > n) ? (n * 1500) : ((n - k - 60) * 3000 + (k + 60) * 1500));
		br.close();
	}
}