import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복문으로 같은 수 찾기
public class B10797_10부제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 날짜의 일의 자리 숫자
		String s[] = br.readLine().split(" "); // 차량 번호의 일의 자리 숫자

		int cnt = 0; // 10부제 위반하는 차량의 대수
		for (int i = 0; i < s.length; i++) {
			cnt += Integer.parseInt(s[i]) == N ? 1 : 0; // 숫자가 같으면 +1 아니면 +0
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}