import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 수 n개를 2개씩 조합하고(nC2) 두 수의 gcd를 구하여 합하기
public class B9613_GCD_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int t = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < t; tc++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); // 수의 개수
			int num[] = new int[n]; // 수
			for (int i = 0; i < n; i++) { // input num[]
				num[i] = Integer.parseInt(st.nextToken());
			}
			long gcdsum = 0; // gcd 합
			int p[] = new int[n]; // np를 위한 요소
			int cnt = 2;
			for (int i = 0; i < cnt; i++) {
				p[n - 1 - i] = 1;
			}
			do {
				LinkedList<Integer> list = new LinkedList<>(); // 조합으로 골라낸 수
				for (int i = 0; i < n; i++) {
					if (p[i] == 1) {
						list.add(num[i]);
					}
				}
				gcdsum += GCD(list.get(0), list.get(1)); // gcd 합에 gcd 더하기
			} while (np(p));
			sb.append(gcdsum).append("\n"); // sb에 추가
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

	// np
	public static boolean np(int[] p) {
		int n = p.length;
		int i = n - 1;
		while (i > 0 && p[i - 1] >= p[i]) {
			i--;
		}
		if (i == 0) {
			return false;
		}
		int j = n - 1;
		while (p[i - 1] >= p[j]) {
			j--;
		}
		swap(p, i - 1, j);
		int k = n - 1;
		while (i < k) {
			swap(p, i++, k--);
		}
		return true;
	}

	// p 배열의 두 수 교환
	public static void swap(int[] p, int i, int j) {
		int temp = p[i];
		p[i] = p[j];
		p[j] = temp;
	}
}
