import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15923
// 연속되어 있는 꼭짓점이 주어지므로 전후의 꼭짓점 사이의 거리를 구해서 더하기
// 마지막 꼭짓점과 첫번째 꼭짓점과의 거리도 추가해야 함
public class B15923_욱제는_건축왕이야 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 꼭짓점 개수
		int sum = 0; // 둘레
		int vertex[][] = new int[N][2]; // 꼭짓점 좌표
		StringTokenizer st = new StringTokenizer(br.readLine());
		vertex[0][0] = Integer.parseInt(st.nextToken()); // 첫 번째 꼭짓점
		vertex[0][1] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N; i++) { // 두 번째 꼭짓점부터 마지막 꼭짓점까지
			st = new StringTokenizer(br.readLine());
			vertex[i][0] = Integer.parseInt(st.nextToken()); // i번째 꼭짓점
			vertex[i][1] = Integer.parseInt(st.nextToken());
			// i번째 꼭짓점과 그 이전 꼭짓점 사이의 거리를 더함
			sum += Math.abs(vertex[i][0] - vertex[i - 1][0] + vertex[i][1] - vertex[i - 1][1]);
		}
		// 마지막 꼭짓점과 첫번째 꼭짓점 사이의 거리를 더함
		sum += Math.abs(vertex[0][0] - vertex[N - 1][0] + vertex[0][1] - vertex[N - 1][1]);
		System.out.println(sum); // 출력
		br.close();
	}
}
