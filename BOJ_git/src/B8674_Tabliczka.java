import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 초콜릿 한 변이 짝수라면 최소 차이는 0
// 모두 홀수라면 가로 세로 길이 중 짧은 변의 길이만큼 차이
public class B8674_Tabliczka {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		long a = Long.parseLong(s[0]); // 행
		long b = Long.parseLong(s[1]); // 열
		if (a % 2 == 0 || b % 2 == 0) { // 한 변이 짝수일 때
			System.out.println(0); // 차이는 0
		} else { // 모두 홀수일 때
			System.out.println(Math.min(a, b)); // 차이는 가장 짧은 변의 길이
		}
		br.close();
	}
}