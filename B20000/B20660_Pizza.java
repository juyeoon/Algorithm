import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/20660
// 싫어하는 토핑을 Set에 저장 후 입력 받은 토핑이 하나라도 Set에 저장되어 있으면 주문 불가능
public class B20660_Pizza {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 싫어하는 토핑 개수
		HashSet<Integer> dislike = new HashSet<>(); // 싫어하는 토핑
		for (int i = 0; i < n; i++) {
			dislike.add(Integer.parseInt(st.nextToken()));
		}
		int m = Integer.parseInt(br.readLine()); // 피자 개수
		int cnt = 0; // 주문 가능한 피자 개수
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken()); // 해당 피자의 토핑 개수
			boolean ok = true; // 이 피자를 주문할 수 있는지 여부
			for (int j = 0; j < k; j++) {
				int topping = Integer.parseInt(st.nextToken());
				if (dislike.contains(topping)) { // 싫어하는 토핑이 하나라도 있으면 주문 불가
					ok = false;
				}
			}
			if (ok) {
				cnt++;
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
