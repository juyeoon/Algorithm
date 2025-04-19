import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1440
// 시(HH), 분(MM), 초(SS)로 해석하는 가능한 모든 순열(총 6가지)을 확인
// 유효한 시는 01~12, 유효한 분/초는 00~59 범위를 만족해야 함
// 각 순열마다 유효성을 검사하여 가능한 경우의 수를 셈
public class B1440_타임머신 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		String[] values = new String[3]; // 입력 받은 시분초
		for (int i = 0; i < 3; i++) {
			values[i] = st.nextToken();
		}
		int cnt = 0; // 가능한 시간 해석 방법의 수
		int[][] perm = { { 0, 1, 2 }, { 0, 2, 1 }, { 1, 0, 2 }, { 1, 2, 0 }, { 2, 0, 1 }, { 2, 1, 0 } }; // 가능한 시, 분, 초의 순열 (인덱스)
		for (int[] p : perm) { // 각 순열에 대해 유효한 시간인지 검사
			int h = Integer.parseInt(values[p[0]]);
			int m = Integer.parseInt(values[p[1]]);
			int s = Integer.parseInt(values[p[2]]);
			// 시는 1~12, 분과 초는 0~59일 경우만 유효
			if ((h >= 1 && h <= 12) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59)) {
				cnt++;
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
