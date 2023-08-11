import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10진법을 B진법으로 변환 => 10진법 수 N을 몫이 0이 될 때까지 B로 계속 나눈 나머지를 역순으로 출력
public class B11005_진법_변환_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 10진법 수
		int B = Integer.parseInt(s[1]); // B진법
		while (N > 0) { // 몫이 0이 될때까지 반복
			int tmp = N % B; // 나머지
			if (tmp > 9) { // A~Z
				sb.append((char) (tmp + 55));
			} else { // 0~9
				sb.append(tmp);
			}
			N /= B; // 나누기
		}
		System.out.println(sb.reverse()); // 역순 출력
		br.close();
	}
}