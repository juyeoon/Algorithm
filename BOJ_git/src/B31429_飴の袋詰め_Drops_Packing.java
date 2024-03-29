import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가격이 A인 사탕을 B개, 가격이 C인 봉투를 1개 구매했을 때 총 금액을 구하는 문제
// = A * B + C * 1
public class B31429_飴の袋詰め_Drops_Packing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine()); // 사탕 가격
		int B = Integer.parseInt(br.readLine()); // 사탕 구매 개수
		int C = Integer.parseInt(br.readLine()); // 봉투 가격
		System.out.println(A * B + C); // 출력
		br.close();
	}
}