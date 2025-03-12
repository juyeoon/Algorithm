import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 총 금액 = 팀 수(n) * 4000
public class B30328_Java_Warriors {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 팀 수
		System.out.println(n * 4000); // 출력
		br.close();
	}
}