import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/25915
// 현재 문자과 다음 문자의 차의 합을 구함 (다음 문자를 현재 문자로 갱신하며 반복)
public class B25915_연세여_사랑한다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char now = br.readLine().charAt(0); // 현재 문자
		int sum = 0; // 거리의 합
		String s = "ILOVEYONSEI"; // 입력해야 하는 문자열
		for (int i = 0; i < s.length(); i++) { // 문자열 길이만큼 반복
			char tmp = s.charAt(i); // 다음 문자
			sum += Math.abs(now - tmp); // 현재 문자와 다음 문자의 거리(차)를 합에 더함
			now = tmp; // 현재 문자 갱신
		}
		System.out.println(sum); // 합 출력
		br.close();
	}
}
