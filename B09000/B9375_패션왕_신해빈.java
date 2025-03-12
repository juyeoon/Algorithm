import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

// 가능한 옷 조합은 옷 종류마다 (고르지 않음, 1번 옷 선택, 2번 옷 선택, ..., n번 옷 선택)(해당 종류에 옷이 n개 있을 때)의 경우가 있고 알몸이 되는 경우는 제외해야 하므로
// (옷 종류 1의 개수 + 1) * (옷 종류 2의 개수 + 1) * ... * (옷 종류 n의 개수 + 1) - 1
// 옷 종류를 key값으로 하는 hashmap 사용헤서 개수 세기 (value: 옷 개수)
public class B9375_패션왕_신해빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 해빈이가 가진 의상의 수
			HashMap<String, Integer> hashmap = new HashMap<>(); // key: 의상 종류, value: 해당 종류의 옷 개수
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken(); // 옷 이름
				String kind = st.nextToken(); // 옷 종류
				if (hashmap.containsKey(kind)) { // 옷 종류가 이미 key로 존재하면
					hashmap.put(kind, hashmap.get(kind) + 1); // key에 대한 value를 ++
				} else { // key가 존재하지 않으면
					hashmap.put(kind, 1); // map에 추가
				}
			}
			int sum = 1; // 조합의 수
			for (String key : hashmap.keySet()) { // keySet 순회
				sum *= (hashmap.get(key) + 1); // (0(고르지 않음)부터 value값) 개수를 곱하기
			}
			sb.append(sum - 1).append("\n"); // 모두 다 고르지 않는 경우 한 가지를 제외하고 조합 개수 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}