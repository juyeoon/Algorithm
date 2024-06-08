import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 자리에 올 수 있는 수를 level로 생각하여 맨 앞자리 수를 시작노드로 잡는 dfs
// 맨 앞자리에 올 수 있는 수 => { 2, 3, 5, 7 } (소수만 가능)
// 그 뒤 모든 자리에 올 수 있는 수 => { 1, 3, 7, 9 } (2의 배수는 2로 나누어지므로 안 됨, 5는 5의 배수가 되므로 안 됨)
// 처음에 dfs(2), (3), (5), (7) 호출
// 한 자리씩 붙일 때마다 소수 판단 후 소수면 dfs(...1), (...3), (...7), (...9) 호출
// dfs 재귀 끝 조건 => 길이가 N이 됐을 때 끝(소수 판단은 이전에 완료했으므로 따로 필요 X), 출력 저장

public class B2023_신기한_소수 {
	public static int N; // 자리 수
	public static StringBuilder sb;
	public static int[] a; // 2번째 자리부터 올 수 있는 수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		a = new int[] { 1, 3, 7, 9 }; // 2번째 자리부터 올 수 있는 수
		dfs(2, 1); // 2...
		dfs(3, 1); // 3...
		dfs(5, 1); // 5...
		dfs(7, 1); // 7...
		System.out.println(sb); // 출력
		br.close();
	}

	public static void dfs(int num, int leng) { // num: 이전 수, leng: 현재 자리 수
		if (leng == N) { // 재귀 끝 조건
			sb.append(num).append("\n");
			return;
		}
		for (int i = 0; i < 4; i++) { // 뒤에 붙일 수 있는 수 개수만큼 반복
			if (prime(num * 10 + a[i])) { // 뒤에 수를 붙였을 때 소수가 되면
				dfs(num * 10 + a[i], leng + 1); // 수를 붙여서 dfs 호출
			}
		}

	}

	public static boolean prime(int num) { // 소수 판별
		boolean prime = true;
		int sqrt = (int) Math.sqrt(num);
		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}