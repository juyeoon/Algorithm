import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 식을 이용한 단순 계산 문제
public class B17356_욱_제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		double M = (Double.parseDouble(s[1]) - Double.parseDouble(s[0])) / 400;
		System.out.println(1 / (1 + Math.pow(10, M))); // 정답 출력
		br.close();
	}
}