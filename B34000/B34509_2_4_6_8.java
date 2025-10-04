// https://www.acmicpc.net/problem/34509
// 조건에 맞게 구현
public class B34509_2_4_6_8 {
	public static void main(String[] args) {
		int ans = 9; // 정답인 N
		while (ans < 99) { // 1. N은 2자리 수이다.
			ans++;
			int tenP = ans / 10; // 10의 자리 수
			int oneP = ans % 10; // 1의 자리 수
			if (tenP == 8 || oneP == 8) { // 2. N에는 숫자 8이 없다.
				continue;
			}
			if ((oneP * 10 + tenP) % 4 != 0) { // 3. N을 문자열로 보고 뒤집었을 때 얻는 수는 4의 배수이다.
				continue;
			}
			if ((oneP + tenP) % 6 != 0) { // 4. N의 각 자리 수의 합은 6의 배수이다.
				continue;
			}
			break;
		}
		System.out.println(ans); // 출력
	}
}
