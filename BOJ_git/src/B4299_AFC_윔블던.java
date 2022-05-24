import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 합과 차가 2의 배수가 아니면 각각의 점수를 구할 수 없다.
public class B4299_AFC_윔블던 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int sum = Integer.parseInt(s[0]); // 합
		int diff = Integer.parseInt(s[1]); // 차
		// 합보다 차가 크거나, 합과 차의 합이 2의 배수가 아니면 각각의 점수를 구할 수 없다.
		System.out.println((sum < diff || (sum + diff) % 2 != 0) ? -1 : (sum + diff) / 2 + " " + (sum - (sum + diff) / 2));
		br.close();
	}
}
