import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 총 통잔 잔고 - 치킨 두 마리 가격 구하기(사칙연산)
public class B14489_치킨_두_마리_ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // 통장 잔고 1
		int B = Integer.parseInt(s[1]); // 통장 잔고 2
		int C = Integer.parseInt(br.readLine()); // 치킨 한 마리 가격
		int result = (A + B) - (C * 2); // 총 통잔 잔고 - 치킨 두 마리 가격
		System.out.println(result >= 0 ? result : A + B); // 살 수 있으면, 사고 남은 잔고 출력. 없으면, 현재 통장 잔고 출력
		br.close();
	}
}
