import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32902
// k개의 캔에 n개의 칩이 있고 1분마다 칩을 먹을 때 총 몇분 뒤에 먹을 캔이 없어지나 (최대 최소)
// 1분마다 k개의 캔에 있는 칩을 하나씩 먹으면 총 n+1분 뒤에는 다 먹음(최소)
// 1분마다 1개의 캔을 골라 칩을 하나씩 먹으면 총 n*k+1분 뒤에 다 먹음(최대)
public class B32902_Chips {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken()); // 캔 개수
		int n = Integer.parseInt(st.nextToken()); // 칩 개수
		System.out.println((n + 1) + " " + (n * k + 1)); // 최소 최대 출력
		br.close();
	}
}
