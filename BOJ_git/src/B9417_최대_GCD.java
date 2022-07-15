import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 9417 - 최대 GCD
// https://www.acmicpc.net/problem/9417
public class B9417_최대_GCD {
	public static int maxGCD, n;
	public static int num[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			maxGCD = Integer.MIN_VALUE; // 최대 GCD
			st = new StringTokenizer(br.readLine());
			n = st.countTokens(); // 수 개수
			num = new int[n]; // 수
			for (int i = 0; i < n; i++) { // input num[]
				num[i] = Integer.parseInt(st.nextToken());
			}
			// 조합
			int p[] = new int[n]; // 인덱스(위치) 배열
			int cnt = 0;
			while (++cnt <= 2) { // input p[]
				p[n - cnt] = 1;
			}
			do {
				LinkedList<Integer> list = new LinkedList<>(); // 조합으로 만들어진 두 수
				for (int i = 0; i < n; i++) {
					if (p[i] == 1) { // 선택된 인덱스(위치)
						list.add(num[i]); // 조합 리스트에 추가
					}
				}
				// 최대 GCD 구하기
				maxGCD = Math.max(maxGCD, GCD(list.get(0), list.get(1)));
			} while (np(p));
			sb.append(maxGCD).append("\n"); // 하나의 테스트 케이스의 최대 GCD sb에 추가
		}
		System.out.println(sb); // 출력
		br.close();
	}

	// 유클리드 호제법으로 최대공약수 구하기
	public static int GCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return GCD(b, a % b);
	}

	// next permutation
	public static boolean np(int p[]) {
		// 1. 교환 위치 찾기(0으로 떨어지는 곳의 0부분을 교환)
		int i = n - 1; // p의 끝 인덱스
		while (i > 0 && p[i - 1] >= p[i]) { // 뒤의 것이 더 크면(0-1(현재) 상태) 멈춤
			i--;
		}

		// 현재 상태: [i] = 1, [i-1] = 0

		// i가 0이거나, 작은 걸 만나면 내려옴
		if (i == 0) {// i가 0 => 조합 생성 끝
			return false; // 끝
		}
		// 작은 걸 만남
		// 2. 교환 위치에 교환할 값 찾기(뒤에서 처음으로 나오는 1을 교환)
		int j = n - 1;
		while (p[i - 1] >= p[j]) { // p[j]가 1이면 멈춤
			j--;
		}
		// 3. 교환
		swap(p, i - 1, j);

		// 4. 교환 위치 뒤를 오름차순으로 정리
		int k = n - 1; // i-1은 정리 안 함, i는 정리함(i-1뒤쪽 앞은 1이고 뒤는 0으로 되어 있는 상태(섞여있지 않음))
		while (i < k) {
			swap(p, i++, k--); // i는 뒤로, k는 앞으로
		}
		return true; // 순열 생성 성공
	}

	// p의 [i]값과 [j]값 교환
	public static void swap(int[] p, int i, int j) {
		int temp = p[i];
		p[i] = p[j];
		p[j] = temp;
	}

}
