import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 앞의 수가 현재 수보다 크면 앞의 수에서 오르막길 끝 
// => 오르막길 시작부터 오르막길 종료까지의 길이를 구한 후 최댓값과 비교하여 최댓값 갱신, 오르막길 시작을 현재 수로 변경
// 마지막 수는 판정이 반복문에서 불가하기 때문에 오르막길 시작부터 마지막 값까지의 길이를 구한 후 최댓값을 갱신하는 과정 필요
public class B2846_오르막길 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 수 개수
		String s[] = br.readLine().split(" "); // 수 배열
		int start = Integer.parseInt(s[0]); // 오르막길 시작 수
		int max = 0; // 오르막길 크기 최댓값
		for (int i = 1; i < N; i++) { // 두번째부터 마지막 수까지
			if (Integer.parseInt(s[i - 1]) >= Integer.parseInt(s[i])) { // 앞의 수에서 오르막길이 끝이 나면
				max = Math.max(max, Integer.parseInt(s[i - 1]) - start); // 최댓값 갱신
				start = Integer.parseInt(s[i]); // 시작값 갱신
			}
		}
		max = Math.max(max, Integer.parseInt(s[N - 1]) - start); // 오르막길 시작부터 마지막 값까지 계산 후 최댓값 갱신
		System.out.println(max); // 출력
		br.close();
	}
}