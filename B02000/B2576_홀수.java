import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// num%2!=0이면 num은 홀수
// num이 홀수이면 합에 num 추가, num이 최솟값보다 작으면 num으로 최솟값 갱신
// 합이 0이면 홀수가 없는 것이기 때문에 -1 출력
public class B2576_홀수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int sum = 0; // 홀수의 합
		int min = Integer.MAX_VALUE; // 홀수 중 최솟값
		for (int i = 0; i < 7; i++) { // 7번 반복
			int num = Integer.parseInt(br.readLine()); // 입력 받은 숫자
			if (num % 2 != 0) { // 홀수이면
				sum += num; // 합에 num 추가
				min = Math.min(min, num); // 최솟값 갱신
			}
		}
		if (sum == 0) { // 합이 0이면(입력에 홀수가 없으면)
			sb.append(-1); // -1 출력
		} else { // 합이 0이 아니면(입력에 홀수가 있으면)
			sb.append(sum).append("\n").append(min); // 합, 최솟값 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
