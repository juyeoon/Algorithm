import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/8638
// 전체 점수 중 최댓값을 구한 후 최댓값을 가지는 선수 번호를 출력
public class B8638_Zwycięzcy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 선수 수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] score = new int[N]; // 각 선수의 점수
		int max = 0; // 점수의 최댓값
		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
			if (score[i] > max) { // 최댓값 갱신
				max = score[i];
			}
		}
		for (int i = 0; i < N; i++) { // 최댓값을 가지는 선수 찾기
			if (score[i] == max) {
				sb.append((char) ('A' + i)); // 선수 번호 출력 저장
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
