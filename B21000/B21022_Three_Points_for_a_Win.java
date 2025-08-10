import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/21022
// 각 경기마다 BINUS 팀 점수와 상대 점수를 비교하여 승리면 3점, 무승부면 1점을 누적해 총합을 출력
public class B21022_Three_Points_for_a_Win {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 경기 수
		int[] A = new int[N]; // BINUS 팀 점수
		int[] B = new int[N]; // 상대 팀 점수
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // A[] 채우기
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // B[] 채우기
			B[i] = Integer.parseInt(st.nextToken());
		}
		int points = 0; // 총 점수
		for (int i = 0; i < N; i++) {
			if (A[i] > B[i]) {
				points += 3; // 승리
			} else if (A[i] == B[i]) {
				points += 1; // 무승부
			}
		}
		System.out.println(points); // 출력
		br.close();
	}
}
