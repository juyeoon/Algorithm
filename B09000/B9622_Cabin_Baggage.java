import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/9622
// 항공사의 기내 반입 수하물 기준을 만족하는지 확인
// 세 변이 모두 최대 크기 이하이거나, 세 변의 합이 125cm 이하인지 확인
// 무게가 7kg 이하인지 확인
// 조건을 만족하면 1, 만족하지 않으면 0
// 마지막 줄에 허용된 개수 출력
public class B9622_Cabin_Baggage {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		int cnt = 0; // 허용된 수하물 개수
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double l = Double.parseDouble(st.nextToken()); // 길이
			double w = Double.parseDouble(st.nextToken()); // 너비
			double d = Double.parseDouble(st.nextToken()); // 높이
			double weight = Double.parseDouble(st.nextToken()); // 무게
			// 길이 ≤ 56cm, 너비 ≤ 45cm, 높이 ≤ 25cm 또는 세 변의 합 ≤ 125cm
			// 그리고 무게 ≤ 7
			if (((l <= 56 && w <= 45 && d <= 25) || (l + w + d <= 125)) && (weight <= 7)) {
				sb.append("1\n"); // 허용 O
				cnt++;
			} else {
				sb.append("0\n"); // 허용 X
			}
		}
		sb.append(cnt); // 허용된 수하물 개수 추가
		System.out.println(sb); // 출력
		br.close();
	}
}
