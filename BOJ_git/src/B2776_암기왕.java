import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이분 탐색
public class B2776_암기왕 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 수첩 1에 적어놓은 정수 개수
			st = new StringTokenizer(br.readLine());
			int yj[] = new int[N]; // 수첩 1에 적어놓은 정수 배열
			for (int i = 0; i < N; i++) { // input yj[]
				yj[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(yj); // yj 오름차순 정렬
			int M = Integer.parseInt(br.readLine()); // 수첩 2에 적어 놓은 정수 개수
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				boolean check = false; // 수첩 1에 있으면 true
				int num = Integer.parseInt(st.nextToken()); // 확인할 정수
				int lo = 0; // 왼쪽 끝(최솟값 위치)
				int hi = N - 1; // 오른쪽 끝(최댓값 위치)
				while (lo + 1 < hi) { // lo보다 hi가 무조건 크게
					int mid = (lo + hi) / 2; // 중간 위치
					if (num > yj[mid]) { // 확인할 정수가 중간값보다 크면
						lo = mid + 1; // 최솟값 위치를 옮김
					} else if (num < yj[mid]) { // 확인할 정수가 중간값보다 작으면
						hi = mid - 1; // 최댓값 위치를 옮김
					} else { // 확인할 정수와 중간값이 같으면
						check = true; // 수첩 1에 있는 것
						break; // 반복 멈춤
					}
				}
				if (yj[lo] == num || yj[hi] == num) { // 최소 위치와 최대 위치에 있는지 확인
					check = true;
				}
				sb.append(check ? "1\n" : "0\n"); // sb에 넣기
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}