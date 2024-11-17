import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32651
// 100000 이하이고 2024로 나눈 나머지가 0일 때만 Yes
public class B32651_인간은_무엇인가 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력 수
		if (N <= 100000 && N % 2024 == 0) { // 100000 이하이고 2024로 나눈 나머지가 0
			System.out.println("Yes");
		} else { // 그 외
			System.out.println("No");
		}
		br.close();
	}
}
