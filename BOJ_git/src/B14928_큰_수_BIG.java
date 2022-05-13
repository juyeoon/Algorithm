import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 세로로 나누기 방법을 구현
public class B14928_큰_수_BIG {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int remain = 0; // 나머지
		for (int i = 0; i < N.length(); i++) { // 첫째 자리부터 시작
			int num = N.charAt(i) - '0'; // 자리 수
			// 앞에서 계산한 나머지에 10을 곱하고 계산할 자리수를 더해서 20000303으로 나누기
			remain = (remain * 10 + num) % 20000303; 
		}
		System.out.println(remain);
	}
}
