import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이분 탐색
// 상근이가 가진 카드를 오름차순으로 정렬 후 이분탐색으로 배열에 있는지 확인
public class B10815_숫자_카드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine()); // 상근이가 가진 정수 개수
		int sg[] = new int[N]; // 상근이가 가진 정수 배열
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // input sg[]
			sg[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sg); // 오름차순으로 정렬
		int M = Integer.parseInt(br.readLine()); // 확인할 정수 개수
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) { // 정수의 개수만큼 반복
			boolean check = false; // 상근이가 가진 카드에 정수가 존재하면 true
			int num = Integer.parseInt(st.nextToken()); // 확인할 정수
			int lo = 0; // 왼쪽 끝(최솟값)
			int hi = N - 1; // 오른쪽 끝(최댓값)
			while (lo + 1 < hi) { // lo와 hi 사이에 숫자 하나 이하가 존재할 때까지 반복
				int mid = (lo + hi) / 2; // 중간 위치
				if (num > sg[mid]) { // num이 중간값보다 크면
					lo = mid + 1; // lo를 바꾸기
				} else if (num < sg[mid]) { // num이 중간값보다 작으면
					hi = mid - 1; // hi를 바꾸기
				} else { // 같으면
					check = true; // 존재하는 것
					break;
				}
			}
			if (sg[lo] == num || sg[hi] == num) { // 반복문이 끝난 뒤 lo와 hi 위치 확인
				check = true;
			}
			sb.append(check ? "1 " : "0 "); // sb에 답 추가
		}
		System.out.println(sb); // 출력
		br.close();
	}
}