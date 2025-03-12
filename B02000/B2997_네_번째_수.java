import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 세 가지 경우 가능
// i) 1번째 or 4번째 항이 비어있는 경우 => 세 수가 등차수열을 이룸
// ii) 2번째 항이 비어있는 경우 => (3번째 항 - 1번째 항)이 (4번째 항 - 3번째 항)의 2배일 때
// iii) 3번째 항이 비어있는 경우 => (4번째 항 - 3번째 항)이 (3번째 항 - 1번째 항)의 2배일 때
public class B2997_네_번째_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int num[] = new int[3]; // 입력 수
		for (int i = 0; i < 3; i++) { // input num[]
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num); // 오름차순으로 정렬
		int a = num[1] - num[0]; // 최솟값과 중간값의 차
		int b = num[2] - num[1]; // 최댓값과 중간값의 차
		if (a == b) { // 세 수가 등차수열을 이룸
			System.out.println(num[2] + b); // 4번째 항 출력
		} else if (a == 2 * b) { // 최솟값과 중간값의 차 == 최댓값과 중간값의 차의 2배
			System.out.println(num[0] + b); // 2번째 항 출력
		} else if (2 * a == b) { // 최댓값과 중간값의 차 == 최솟값과 중간값의 차의 2배
			System.out.println(num[1] + a); // 3번째 항 출력
		}
		br.close();
	}
}