import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 라운드 당 문제 수는 2~3개
// 최소 문제 수는 (입력 라운드+연습라운드) * 2
// 최대 문제 수는 (입력 라운드+연습라운드) * 3
public class B8871_Zadanie_próbne_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 라운드 수
		System.out.println((2 * (N + 1)) + "\n" + (3 * (N + 1))); // 최소 라운드 최대 라운드
		br.close();
	}
}
