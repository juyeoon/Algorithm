import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/23371
// 각 범위 당 데이터 캐수를 먼저 구함 => bin 개수 크기의 배열에 [(데이터 값 - 1) / bin 크기]에 값 + 1
// 그래프의 모양을 저장하는 이차원 배열을 생성 -> 열을 반복하며 세로 선을 채움
// . 개수 => 그래프의 최댓값 - 현재 값, # 개수 => 나머지 값
// 이차원 배열을 행 -> 열 반복으로 출력 저장
// 마지막에 n만큼의 -를 추가하여 출력 형식 맞추기
public class B23371_Histogram {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // bin의 개수
		int s = Integer.parseInt(st.nextToken()); // bin 당 크기
		int k = Integer.parseInt(st.nextToken()); // 데이터 개수
		int cnt[] = new int[n]; // 각 범위당 데이터 개수
		st = new StringTokenizer(br.readLine()); // 데이터
		for (int i = 0; i < k; i++) {
			cnt[(Integer.parseInt(st.nextToken()) - 1) / s]++; // 카운트

		}
		int maxVal = 0; // 최대 데이터 개수
		for (int i : cnt) { // maxVal 구하기
			maxVal = Math.max(maxVal, i);
		}
		char graph[][] = new char[maxVal][n]; // 그래프
		for (int j = 0; j < n; j++) { // 열
			int i = 0; // 행 인덱스
			while (i < (maxVal - cnt[j])) { // .
				graph[i][j] = '.';
				i++;
			}
			while (i < maxVal) { // #
				graph[i][j] = '#';
				i++;
			}
		}
		for (int i = 0; i < maxVal; i++) { // 출력 저장
			for (int j = 0; j < n; j++) {
				sb.append(graph[i][j]);
			}
			sb.append("\n");
		}
		for (int i = 0; i < n; i++) { // 출력 형식 맞추기
			sb.append('-');
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
