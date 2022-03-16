import java.util.Scanner;

// 2~N까지 각각 소인수분해하여(N! = 1*2*...*N이기 때문)
// 2의 지수와 5의 지수 중 적은 개수(10의 지수)를 출력
public class B1676_팩토리얼_0의_개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N!
		int[] num = { 2, 5 }; // 2와 5(인덱스로 소인수분해하기 위해 배열 사용)
		int[] cnt = new int[2]; // 소인수분해 2와 5의 개수

		for (int i = 2; i <= N; i++) {  // 2~N까지 각각 소인수분해
			int a = i; // a에 계속 변화가 생기기 때문에 i와 같은 a를 따로 사용
			for (int j = 0; j < 2; j++) { // 2와 5로 나누어 주기
				int b = num[j]; // 2 또는 5
				while (a % b == 0) { // a를 2 또는 5로 나누어 떨어짐
					cnt[j]++; // 개수 ++
					a /= b; // a를 2 또는 5로 나눔
				}
			}
		}
		System.out.println(Math.min(cnt[0], cnt[1])); // 10의 지수
		sc.close();
	}
}
