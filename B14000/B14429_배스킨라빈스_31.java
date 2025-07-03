import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14429
// 둘이서 31 게임을 무조건 이기는 방법: 선공을 맡는다.
// 필승 숫자의 초항을 부른다. (j - 1) % (1 + m)
// 그 이후로 (상대방 -> 본인) 턴이 총 (m + 1)이 되게 부른다.
// 이걸 계산하자면 (전체 - 부르면 지는 수를 부르는 턴 - 초항)을 (m + 1)로 나누는데 이게 2명이서 맞춰 부른 턴이기 때문에 2를 곱하고
// 거기에 초항을 부르는 턴과 부르면 지는 수를 부르는 턴을 더하면 최소 턴수로 이길 수 있음.
public class B14429_배스킨라빈스_31 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 플레이할 게임의 판 수
		int minCnt = Integer.MAX_VALUE; // 최소 턴의 수
		int minIdx = 0; // 최소 턴의 게임 번호
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int j = Integer.parseInt(st.nextToken()); // 말하면 지는 숫자
			int m = Integer.parseInt(st.nextToken()); // 한 턴에 말할 수 있는 최대 자연수의 개수
			int r = (j - 1) % (1 + m); // 필승 숫자의 초항
			int cnt = (j - 1 - r) / (m + 1) * 2 + 2; // 최소 턴 수의 길이
			if (cnt < minCnt) { // 최소 턴 수를 가지는 게임 갱신
				minCnt = cnt;
				minIdx = i;
			}
		}
		System.out.println(minIdx + " " + minCnt); // 출력
		br.close();
	}
}
