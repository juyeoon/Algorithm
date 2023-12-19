import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 42의 배수 판정 => 2의 배수 && 3의 배수 && 7의 배수
// 2의 배수 판정 => 일의 자릿수가 0,2,4,6,8이면 2의 배수
// 3의 배수 판정 => 각 자릿수의 합이 3의 배수면 3의 배수
// 7의 배수 판정 => 일의 자리부터 각 자리 수에 1, 3, 2, 6, 4, 5를 반복하여 곱한 값의 합이 7의 배수이면 7의 배수
public class B30664_Loteria_Falha {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOI
			int leng = s.length(); // 입력값 길이
			// 2의 배수 여부 확인
			char last = s.charAt(leng - 1); // 일의 자릿수
			if (last != '0' && last != '2' && last != '4' && last != '6' && last != '8') { // 일의 자릿수가 0,2,4,6,8이 아니면 2의 배수가 아님
				sb.append("TENTE NOVAMENTE\n");
				continue;
			}
			// 3의 배수 여부 확인
			int digitSum = 0; // 각 자릿수의 합
			for (int i = 0; i < leng; i++) { // 자릿수 합 구하기
				digitSum += s.charAt(i) - '0';
			}
			if (digitSum % 3 != 0) { // 각 자릿수의 합이 3의 배수가 아니면 3의 배수가 아님
				sb.append("TENTE NOVAMENTE\n");
				continue;
			}
			// 7의 배수 여부 확인
			int sevenSum = 0; // 일의 자리부터 각 자리 수에 1, 3, 2, 6, 4, 5를 반복하여 곱한 값의 합
			int num[] = { 1, 3, 2, 6, 4, 5 };
			for (int i = 0; i < leng; i++) { // `sevenSum` 구하기
				sevenSum += num[i % 6] * (s.charAt(leng - 1 - i) - '0');
			}
			if (sevenSum % 7 != 0) { // `sevenSum`이 7의 배수가 아니면 7의 배수가 아님
				sb.append("TENTE NOVAMENTE\n");
				continue;
			}
			sb.append("PREMIADO\n"); // 2의 배수 && 3의 배수 && 7의 배수
		}
		System.out.println(sb); // 출력
		br.close();
	}
}