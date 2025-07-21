import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34071
// 첫 번째 입력 수를 따로 저장한 후 최댓값과 최솟값을 첫 번째 입력 수로 초기화
// 이후 입력 수들을 확인하면서 최댓값과 최솟값을 갱신
// i) 최솟값과 첫 번째 값이 같음 => 첫 번째 문제가 가장 쉬운 문제
// ii) 최댓값과 첫 번째 값이 같음 => 첫 번째 문제가 가장 어려운 문제
// iii) 그 외
public class B34071_첫_번째_문제는_정말_쉬운_문제일까 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int first = Integer.parseInt(br.readLine());
		int minNum = first;
		int maxNum = first;
		for (int i = 1; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			minNum = Math.min(minNum, num);
			maxNum = Math.max(maxNum, num);
		}
		if (minNum == first) {
			System.out.println("ez");
		} else if (maxNum == first) {
			System.out.println("hard");
		} else {
			System.out.println("?");
		}
		br.close();
	}
}
