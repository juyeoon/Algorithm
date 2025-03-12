import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최솟값/최댓값과 점수를 비교하여 최솟값/최댓값을 갱신. 최댓값-최솟값 출력
public class B15969_행복 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 학생 수
		int min = Integer.MAX_VALUE; // 최솟값
		int max = Integer.MIN_VALUE; // 최댓값
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(s[i]); // 점수
			min = Math.min(min, tmp); // 최솟값 갱신
			max = Math.max(max, tmp); // 최댓값 갱신
		}
		System.out.println(max - min); // 최댓갑 - 최솟값 출력
		br.close();
	}
}