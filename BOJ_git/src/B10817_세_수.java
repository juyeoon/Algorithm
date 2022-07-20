import java.util.Arrays;
import java.util.Scanner;

public class B10817_세_수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[3]; // 세 수를 저장
		for (int i = 0; i < 3; i++) { // input n[]
			n[i] = sc.nextInt();
		}
		Arrays.sort(n); // 오름차순으로 정렬
		System.out.print(n[1]); // 두 번째로 큰 정수를 출력
		sc.close();
	}
}
