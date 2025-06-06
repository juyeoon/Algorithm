import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.print.DocFlavor.STRING;

// https://www.acmicpc.net/problem/10902
// 가장 높은 점수(maxScore)를 찾고, 인덱스(f), 시간(tf), 점수(sf)를 기록
// 점수가 0이면 페널티는 0, 점수가 1 또는 4이면 페널티는 tf + (f - 1) * 20
// 계산된 페널티를 출력
public class B10902_Penalty_calculation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] t = new int[n]; // 각 제출의 제출 시간
		int[] s = new int[n]; // 각 제출의 점수
		for (int i = 0; i < n; i++) { // t[], s[] 입력 받기
			StringTokenizer st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			s[i] = Integer.parseInt(st.nextToken());
		}
		int maxScore = -1; // 점수 최댓값
		for (int i = 0; i < n; i++) { // 최댓값 찾기
			if (s[i] > maxScore) {
				maxScore = s[i];
			}
		}
		int f = -1; // 최댓값에 대한 인덱스
		int tf = 0; // 최댓값에 대한 시간
		int sf = 0; // 최댓값에 대한 점수
		for (int i = 0; i < n; i++) { // f 찾기
			if (s[i] == maxScore) {
				f = i + 1;
				tf = t[i];
				sf = s[i];
				break;
			}
		}
		int penalty = 0; // 페널티
		if (sf == 1 || sf == 4) { // 점수가 1 또는 4이면 페널티는 tf + (f - 1) * 20
			penalty = tf + (f - 1) * 20;
		} else {
			penalty = 0;
		}

		System.out.println(penalty); // 최종 페널티
		br.close();
	}
}
