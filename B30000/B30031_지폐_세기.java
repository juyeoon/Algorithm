import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B30031_지폐_세기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력 개수
		int sum = 0; // 총 금액
		for (int i = 0; i < N; i++) {
			String s[] = br.readLine().split(" "); // 가로 길이
			switch (s[0]) {
			case "136": // 천 원권
				sum += 1000;
				break;
			case "142": // 오천 원권
				sum += 5000;
				break;
			case "148": // 만 원권
				sum += 10000;
				break;
			case "154": // 오만 원권
				sum += 50000;
				break;
			}
		}
		System.out.println(sum); // 출력
		br.close();
	}
}