import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// String 뒤집기 => String의 앞부터 .charAt()으로 가져온 후 숫자로 변형 후 변경된 자리수의 값(1, 10, 100, ...)을 곱함 -> 반복
// int 뒤집기 => 뒤집기 이전의 값을 %10한 값과 뒤집은 값을 저장하는 변수를 *10(자리수 밀기)한 값을 더함. 뒤집기 이전의 값을 /10(계산한 값 버리기) -> 반복
public class B3062_수_뒤집기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			String s = br.readLine(); // 원래 값
			int ans = Integer.parseInt(s); // 원래 값 + 뒤집은 값
			int placeVal = 1; // 뒤집을 때 곱할 자리 값
			for (int i = 0; i < s.length(); i++) { // 원래 값을 뒤집은 값을 원래 값에 더하기
				ans += (s.charAt(i) - '0') * placeVal;
				placeVal *= 10;
			}
			int reverse = 0; // 더해진 값(ans)를 뒤집은 값
			int tmp = ans;
			while (tmp > 9) { // 더해진 값(ans) 뒤집기
				reverse = reverse * 10 + tmp % 10;
				tmp /= 10;
			}
			reverse = reverse * 10 + tmp;
			sb.append(ans == reverse ? "YES\n" : "NO\n"); // 더해진 값(ans)와 뒤집은 값(reverse)가 같은지 다른지 확인
		}
		System.out.println(sb); // 출력
		br.close();
	}
}