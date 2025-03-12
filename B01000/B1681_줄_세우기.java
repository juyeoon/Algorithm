import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자 L이 포함되지 않은 수 N개 중 가장 큰 수 출력
// 두 가지 방법으로 풀이
// i) String.contains()로 포함 여부 확인 => 272 ms
// ii) 수를 자리 수로 나누면서 나머지가 숫자 L인지 확인(수에 숫자가 포함되는지 확인) => 104 ms
public class B1681_줄_세우기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// i) String.contains()로 포함 여부 확인
//		String s[] = br.readLine().split(" ");
//		int N = Integer.parseInt(s[0]); // 수 개수
//		int num = 0; // 확인할 수
//		while (N > 0) { // N이 0이 될 때까지(N개)
//			num++; // 확인할 수 갱신
//			if (!Integer.toString(num).contains(s[1])) { // String 비교로 숫자를 포함하면
//				N--; // 개수 줄이기
//			}
//		}
//		System.out.println(num); // 최댓값 출력

		// ii) 수를 자리 수로 나누면서 나머지가 숫자 L인지 확인(수에 숫자가 포함되는지 확인)
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 수 개수
		int L = Integer.parseInt(s[1]); // 포함 확인 숫자
		int num = 0; // 확인할 수
		while (N > 0) { // N이 0이 될 때까지(N개)
			num++; // 확인할 수 갱신
			int tmp = num; // 확인할 수 복사
			boolean include = false; // 포함 확인(true: 포함)
			while (tmp > 0) { // 모든 자리 수 확인할 때까지 반복
				if (tmp % 10 == L) { // 자리 숫자 확인. 포함하면
					include = true; // 포함 확인
					break; // 반복문 탈출
				}
				tmp /= 10; // 다음 자리 수 확인할 수 있게
			}
			if (!include) { // 포함하지 않으면
				N--; // 개수 갱신
			}
		}
		System.out.println(num); // 최댓값 출력

		br.close();
	}
}