import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 14888 - 연산자 끼워넣기
// https://www.acmicpc.net/problem/14888
public class B14888_연산자_끼워넣기 {
	public static int N;
	public static int[] A;
	public static long minAns, maxAns;
	public static int[] opList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		minAns = Long.MAX_VALUE;
		maxAns = Long.MIN_VALUE;
		A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		opList = new int[N - 1];
		st = new StringTokenizer(br.readLine());
		int idx = 0;
		for (int i = 0; i < 4; i++) {
			int opCnt = Integer.parseInt(st.nextToken());
			for (int j = 0; j < opCnt; j++, idx++) {
				opList[idx] = i;
			}
		}
		backtrack(0, new int[N - 1], new boolean[N - 1]);
		System.out.println(maxAns);
		System.out.println(minAns);
		br.close();
	}

	public static void backtrack(int cnt, int[] nowOp, boolean[] used) {
		if (cnt == N - 1) {
			long ans = calc(nowOp);
			minAns = Math.min(minAns, ans);
			maxAns = Math.max(maxAns, ans);
			return;
		}
		for (int i = 0; i < N - 1; i++) {
			if (used[i]) {
				continue;
			}
			if (i > 0 && opList[i - 1] == opList[i] && !used[i - 1]) {
				continue;
			}
			used[i] = true;
			nowOp[cnt] = opList[i];
			backtrack(cnt + 1, nowOp, used);
			nowOp[cnt] = 0;
			used[i] = false;
		}
	}

	public static long calc(int[] operator) {
		long ret = A[0];
		for (int i = 0; i < N - 1; i++) {
			switch (operator[i]) {
			case 0:
				ret += A[i + 1];
				break;
			case 1:
				ret -= A[i + 1];
				break;
			case 2:
				ret *= A[i + 1];
				break;
			case 3:
				ret /= A[i + 1];
				break;
			}
		}
		return ret;
	}
}
