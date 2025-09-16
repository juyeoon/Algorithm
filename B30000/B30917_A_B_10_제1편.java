import java.io.IOException;
import java.util.Scanner;

// https://www.acmicpc.net/problem/30917
public class B30917_A_B_10_제1편 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		while (a < 9) {
			System.out.println("? A " + a); // 질문
			int resp = sc.nextInt(); // 답
			if (resp == 1) { // a 찾음
				break;
			}
			a++;
		}
		while (b < 9) {
			System.out.println("? B " + b); // 질문
			int resp = sc.nextInt(); // 답
			if (resp == 1) { // b 찾음
				break;
			}
			b++;
		}
		System.out.println("! " + (a + b)); // 출력
	}
}
