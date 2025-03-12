import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17284
// 음료수 종류에 따라 총 음료수 금액을 구한 후 5천원에서 뺀 금액(거스름돈) 출력
public class B17284_Vending_Machine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0; // 음료수 총 금액
		while (st.hasMoreTokens()) { // 음료수 개수만큼 반복
			int num = Integer.parseInt(st.nextToken()); // 음료수 종류에 따른 합 구하기
			if (num == 1) {
				sum += 500;
			} else if (num == 2) {
				sum += 800;
			} else {
				sum += 1000;
			}
		}
		System.out.println(5000 - sum); // 5천원에서 뺀 거스름돈 출력
		br.close();
	}
}
