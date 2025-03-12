import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1층, 2층, 3층에 두었을 때의 경우의 수를 다 계산하여 최소를 출력
// 단순히 사람이 가장 많은 곳에 둘 경우 반례 존재(99 98 100)
public class B15051_Máquina_de_café {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A1 = Integer.parseInt(br.readLine()); // 1번째 층 사람 수
		int A2 = Integer.parseInt(br.readLine()); // 2번째 층 사람 수
		int A3 = Integer.parseInt(br.readLine()); // 3번째 층 사람 수
		int ans1 = A2 * 2 + A3 * 4; // 1번째 층에 두었을 때
		int ans2 = A1 * 2 + A3 * 2; // 2번째 층에 두었을 때
		int ans3 = A1 * 4 + A2 * 2; // 3번째 층에 두었을 때
		System.out.println(Math.min(ans1, Math.min(ans2, ans3))); // 최솟값 출력
		br.close();
	}
}