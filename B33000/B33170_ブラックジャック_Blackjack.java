import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33170
public class B33170_ブラックジャック_Blackjack {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()); // 세 수의 합
		System.out.println(sum <= 21 ? 1 : 0); // 출력 분기
		br.close();
	}
}
