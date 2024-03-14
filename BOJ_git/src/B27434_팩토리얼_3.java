import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

// 분할 정복법으로 절반씩 나누어 계산하기
public class B27434_팩토리얼_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine()); // N!
		bw.write(factorial(1, N).toString()); // 출력
		bw.flush();
		bw.close();
		br.close();
	}

	// 연속한 수 곱하는 함수 (곱하기 시작할 수, 곱하기 마지막 수)
	public static BigInteger factorial(int start, int end) {
		BigInteger ret = BigInteger.valueOf(start); // 리턴값
		if (start < end) { // 종료 조건
			int tmp = (start + end) / 2; // 절반 나누기
			ret = factorial(start, tmp).multiply(factorial(tmp + 1, end)); // 절반씩 구한 값 곱하기
		}
		return ret;
	}
}