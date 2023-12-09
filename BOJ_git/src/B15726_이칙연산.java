import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (나누기 곱하기) 순서의 결과와 (곱하기 나누기) 순서의 결과를 비교하여 큰 값 출력
public class B15726_이칙연산 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		double A = Double.parseDouble(s[0]); // 입력값 A
		int B = Integer.parseInt(s[1]); // 입력값 B
		int C = Integer.parseInt(s[2]); // 입력값 C
		System.out.println((int) Math.max(A / B * C, A * B / C)); // 최댓값 출력
		br.close();
	}
}
