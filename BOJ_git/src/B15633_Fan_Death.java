import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 1부터 n 제곱근까지 반복하면서 약수 쌍(약수 작은 수 * 약수 큰 수 = n인 경우)을 구함
public class B15633_Fan_Death {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 자연수 n
		int end = (int) Math.sqrt(n); // 약수 구할 반복문의 범위(n 제곱근)
		long sum = 0; // 약수의 합
		for (int i = 1; i <= end; i++) { // 약수 구하기
			if (n % i == 0) { // 약수 중 작은 값
				sum += i;
				if (n / i != i) { // 약수 중 큰 값
					sum += n / i;
				}
			}
		}
		bw.write(String.valueOf(sum * 5 - 24)); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}