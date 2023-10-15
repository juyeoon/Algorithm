import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// n을 반복 주기 8로 나눈 나머지로 변경 후 n에 맞는 위치 출력
public class B17362_수학은_체육과목_입니다_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		n %= 8; // 반복 주기 8로 나눈 나머지
		if (n == 0) { // 0 => 8
			System.out.println(2);
		} else if (n <= 5) { // 엄지 ~ 새끼손가락
			System.out.println(n);
		} else { // 약지 ~ 검지
			System.out.println(10 - n);
		}
		br.close();
	}
}