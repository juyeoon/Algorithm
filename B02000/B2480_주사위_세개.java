import java.util.Arrays;
import java.util.Scanner;
// 나올 수 있는 경우를 나누어 계산
public class B2480_주사위_세개 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[3]; // 주사위 3개의 눈
		for (int i = 0; i < 3; i++) {
			n[i] = sc.nextInt();
		} // input
		Arrays.sort(n); // 정렬
		int same = 0; // 3개가 같으면 -3, 2개가 같으면 같은 눈, 전부 다르면 -1
		same = (n[0] == n[1]) ? (n[1] == n[2] ? -3 : n[0]) : (n[2] != n[1] ? -1 : n[1]);
		if (same == -1) { // 전부 다를 때
			System.out.println(n[2] * 100);
		} else if (same == -3) { // 전부 같을 때
			System.out.println(10000 + n[0] * 1000);
		} else { // 2개만 같을 때
			System.out.println(1000 + same * 100);
		}
	}
}
