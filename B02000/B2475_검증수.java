

import java.io.IOException;
import java.util.Scanner;

public class B2475_검증수 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int sum = 0; // 제곱의 합
		for (int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			sum += a * a; 
		}
		System.out.print(sum % 10);
	}
}
