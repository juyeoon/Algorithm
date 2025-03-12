import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 직각삼각형 넓이를 계산하고 1로 나눴을 때 나머지가 0이면 넓이가 정수
public class B15128_Congruent_Numbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		double p1 = Double.parseDouble(s[0]); // 한 변의 분자
		int q1 = Integer.parseInt(s[1]); // 한 변의 분모
		double p2 = Double.parseDouble(s[2]); // 다른 한 변의 분자
		int q2 = Integer.parseInt(s[3]); // 다른 한 변의 분모
		System.out.println((p1 * p2 / q1 / q2 / 2 % 1 == 0.0) ? 1 : 0); // 출력
		br.close();
	}
}