import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32684
// 기물 점수 * 기물 개수의 합
// 후수에는 1.5 더하기
// 비교 후 더 큰 값을 가지는 사람 출력
public class B32684_장기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score[] = { 13, 7, 5, 3, 3, 2 }; // 각 기물의 점수
		StringTokenizer st1 = new StringTokenizer(br.readLine()); // 척이
		StringTokenizer st2 = new StringTokenizer(br.readLine()); // 은규
		double c = 0; // 척이
		double e = 1.5; // 은규 (후수)
		for (int i = 0; i < score.length; i++) { // 기물 점수 구하기
			c += Integer.parseInt(st1.nextToken()) * score[i];
			e += Integer.parseInt(st2.nextToken()) * score[i];
		}
		System.out.println(c > e ? "cocjr0208" : "ekwoo"); // 더 큰 점수를 가진 사람 출력
		br.close();
	}
}
