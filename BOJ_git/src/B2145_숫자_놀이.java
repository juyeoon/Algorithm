import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한 자릿수가 될 때까지 자릿수 더하기 구현
public class B2145_숫자_놀이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOF
			int ans = Integer.parseInt(s); // 자릿수 더한 값
			while (ans > 9) { // 한 자릿수가 될 때까지 반복
				int tmp = 0; // 반복 한 번 했을 때 자릿수 더한 값 저장
				while (ans > 0) { // 이전 값의 자릿수만큼 반복
					tmp += ans % 10; // 자릿수 더하기
					ans /= 10; // 자리 줄이기
				}
				ans = tmp; // 자릿수 더한 값을 갱신
			}
			sb.append(ans).append("\n"); // 결과 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}