import java.util.Scanner;

//그리디 알고리즘 - 5kg가 최대 개수여야 무조건 최소 개수가 성립 
public class B2839_설탕_배달 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 배달할 설탕무게
		int cnt5 = N / 5; // 5kg 설탕의 개수 - 최대 개수
		if (cnt5 * 5 == N) { // 나누어 떨어지면 5kg 개수 출력
			System.out.println(cnt5);
		} else {
			int ans = 0; // 답
			for (int i = cnt5; i >= 0; i--) { // 5kg 설탕 개수를 하나씩 줄여가며 확인
				int m = N - i * 5; // 5kg 설탕 빼고 남은 양
				if (m % 3 == 0) { // 3의 배수면 그때의 5kg 개수와 3kg 개수를 더한 값이 답
					ans = i + m / 3;
					break;
				}
			}
			// 가능한 답이 없으면 ans = 0
			System.out.println(ans == 0 ? -1 : ans);
		}
		sc.close();
	}
}
