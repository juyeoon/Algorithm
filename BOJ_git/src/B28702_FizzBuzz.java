import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 3과 5의 배수가 아닌 수는 무조건 세 개의 연속된 문자열 중 한 번 이상 등장
// 따라서 입력 문자열 중 숫자가 나오는 위치와 수를 확인한 후 다음으로 올 수를 찾고 조건에 맞게 문자열로 변환하여 출력
public class B28702_FizzBuzz {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0; // 세 개의 문자열 중 숫자인 문자열
		int idx = 0; // `num`이 입력되는 순서
		for (int i = 0; i < 3; i++) {
			String s = br.readLine(); // 입력 문자열
			if (s.charAt(0) != 'F' & s.charAt(0) != 'B') { // 입력 문자열이 숫자면
				num = Integer.parseInt(s);
				idx = i;
			}
		}
		for (int i = idx; i < 3; i++) { // 마지막 문자열 다음 수 찾기
			num++;
		}
		// 다음에 올 수를 조건에 맞는 문자열로 변환하여 출력
		if (num % 3 == 0) {
			if (num % 5 == 0) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println("Fizz");
			}
		} else {
			if (num % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(num);
			}
		}
		br.close();
	}
}
