import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 각 학생의 점수 정렬 후 k번째로 높은 학생의 점수 출력
public class B25305_커트라인 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 응시자 수
		int k = Integer.parseInt(st.nextToken()); // 상을 받는 사람의 수
		int score[] = new int[N]; // 각 학생의 점수
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // input score[]
			score[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(score); // 오름차순으로 점수 정렬
		System.out.println(score[N - k]); // 뒤에서 k번째 학생의 점수 출력(=커트라인)
		br.close();
	}
}
