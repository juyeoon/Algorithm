import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// QuickSort를 응용한 QuickSelection 사용
// QuickSort를 사용하되 pivot을 기준으로 필요한 한 쪽만 정렬해나가는 방식
// 자바로 풀면 시간 조건 때문에 sliver 5보다 높은 난이도
public class B11004_K번째_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 수 개수
		int K = Integer.parseInt(st.nextToken()) - 1; // 원하는 위치
		int[] num = new int[N]; // 수
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // num[] 채우기
			num[i] = Integer.parseInt(st.nextToken());
		}
		quickSort(num, 0, N - 1, K); // 정렬
		System.out.println(num[K]); // 출력
	}

	// pivot이 K와 같은지, 두 부분 중 어느 쪽을 정렬할 지 고르는 함수
	static void quickSort(int[] num, int start, int end, int K) {
		if (start >= end) { // 정렬할 것이 없음
			return;
		}
		int pivot = partition(num, start, end); // pivot
		if (pivot == K) { // K와 같으면 더이상 정렬 필요 X
			return;
		} else if (pivot > K) { // pivot 이전 정렬 필요
			end = pivot - 1;
			quickSort(num, start, end, K);
		} else { // pivot 이후 정렬 필요
			start = pivot + 1;
			quickSort(num, start, end, K);
		}
	}

	// quick sort 함수
	static int partition(int[] num, int start, int end) {
		if (start + 1 == end) { // num[] 크기가 2
			if (num[start] > num[end]) {
				swap(num, start, end);
			}
			return start;
		}
		// num[] 크기가 2보다 큼
		int pivot = (start + end) / 2; // 가운데 값을 pivot으로
		swap(num, start, pivot); // 맨 앞과 pivot 위치 바꿈
		pivot = start;
		// 크기 비교를 위한 이동 포인터 설정
		int front = start + 1;
		int back = end;
		// 피벗 기준으로 정렬
		while (front <= back) {
			while (num[front] < num[pivot] && front < num.length - 1) {
				front++;
			}
			while (num[back] > num[pivot] && back > 0) {
				back--;
			}

			if (front <= back) { // front와 back 값 교환
				swap(num, front++, back--);
			}
		}
		// front와 back이 엇갈리면 피벗과 back 위치 교환
		swap(num, pivot, back);
		pivot = back;
		return pivot; // pivot 리턴
	}

	static void swap(int[] num, int i, int j) {
		int tmp = num[i];
		num[i] = num[j];
		num[j] = tmp;
	}
}