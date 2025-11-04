import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/21212
// 각 재료마다 (보유량 / 필요량)을 계산하고, 그 중 최소값이 전체 케이크 개수
public class B21212_Cakes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 재료의 개수
		int min = Integer.MAX_VALUE; // 만들 수 있는 케이크의 최대 개수를 구하기 위한 최소값 초기화
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int required = Integer.parseInt(st.nextToken()); // 케이크 1개당 필요한 양
			int available = Integer.parseInt(st.nextToken()); // 현재 가지고 있는 양
			// 각 재료별로 만들 수 있는 최대 케이크 개수 계산
			int possible = available / required;
			// 전체 재료 중 가장 적게 만들 수 있는 재료 기준으로 최소값 갱신
			if (possible < min) {
				min = possible;
			}
		}
		System.out.println(min);
		br.close();
	}
}
