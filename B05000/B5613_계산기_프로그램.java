import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// "="이 들어올 때까지 반복
// 연산 기호가 들어오면 뒤에 숫자를 지금까지 결과에 연산
public class B5613_계산기_프로그램 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 처음 수
		int res = Integer.parseInt(s); // 결과
		while (!(s = br.readLine()).equals("=")) { // "="이 들어올 때까지 반복
			if (s.equals("+")) { // 더하기
				res += Integer.parseInt(br.readLine());
			} else if (s.equals("-")) { // 빼기
				res -= Integer.parseInt(br.readLine());
			} else if (s.equals("*")) { // 곱하기
				res *= Integer.parseInt(br.readLine());
			} else if (s.equals("/")) { // 나누기
				res /= Integer.parseInt(br.readLine());
			}
		}
		System.out.println(res); // 결과 출력
		br.close();
	}
}