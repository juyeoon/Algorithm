import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 버거 최솟값 + 음료 최솟값 - 50
public class B5543_상근날드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int burMin = Integer.MAX_VALUE;
		int bevMin = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			burMin = Math.min(burMin, Integer.parseInt(br.readLine()));
		}
		for (int i = 0; i < 2; i++) {
			bevMin = Math.min(bevMin, Integer.parseInt(br.readLine()));
		}
		System.out.print(burMin + bevMin - 50);
	}
}
