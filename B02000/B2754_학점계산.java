import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 먼저 알파벳을 구분한 다음 +/0/-에 따라 추가 계산
public class B2754_학점계산 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] c = br.readLine().toCharArray(); // [0]: 알파벳, [1]: +/0/-(F제외)
		double ans = 0.0; // 평점
		if (c[0] != 'F') { // F가 아닐 때
			// 알파벳(0기준)
			if (c[0] == 'A')
				ans = 4.0;
			else if (c[0] == 'B')
				ans = 3.0;
			else if (c[0] == 'C')
				ans = 2.0;
			else if (c[0] == 'D')
				ans = 1.0;
			// +/0/- (0이면 그대로)
			if (c[1] == '-')
				ans -= 0.3;
			else if (c[1] == '+')
				ans += 0.3;
		}
		System.out.println(ans); // 출력
		br.close();
	}

}
