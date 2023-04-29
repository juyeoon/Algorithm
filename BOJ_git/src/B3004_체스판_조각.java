import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 세로로 자른 횟수와 가로로 자른 횟수를 저장 후 각각 1씩 더해서(조각 개수 = 자른 횟수 + 1) 곱하기
// 최대로 자르기 위한 횟수 => 한 번에 최대한 많은 조각을 잘라야 하므로 가로 세로 중 더 적게 자른 방향으로 자르기
public class B3004_체스판_조각 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int horizontal = 0; // 가로로 자른 횟수
		int vertical = 0; // 세로로 자른 횟수
		int N = Integer.parseInt(br.readLine()); // 총 자른 횟수
		for (int i = 0; i < N; i++) { // 둘 중 더 적은 횟수에 +1
			if (horizontal > vertical) { 
				vertical++;
			} else {
				horizontal++;
			}
		}
		System.out.println(++horizontal * ++vertical); // 자른 횟수 +1끼리 곱하기
		br.close();
	}
}