import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 우유를 a->b, b->c, c->a로 붓는 것을 반복할 때 100번째 붓기(a->b)를 한 후의 우유 양을 구하는 문제
// 0->1, 1->2, 2->0, 1->2까지만 하면 됨 (이후로는 2번부터 4번까지 과정 반복)
// 우유가 부을 때 넘치면, 받는 양동이의 우유량: 수용량 만큼, 붓는 양동이의 우유량: 붓고난 나머지 양
// 우유를 부을 때 넘치치 않으면, 받는 양동이에 두 우유의 양의 합을 넣고 붓는 양동이는 0
// 4번 반복하고 상태 출력
public class B16769_Mixing_Milk {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int c[] = new int[3]; // a b c 수용량
		int m[] = new int[3]; // a b c 우유량
		for (int i = 0; i < 3; i++) { // c[], m[] 채우기
			StringTokenizer st = new StringTokenizer(br.readLine());
			c[i] = Integer.parseInt(st.nextToken());
			m[i] = Integer.parseInt(st.nextToken());
		}
		// 0->1, 1->2, 2->0, 1->2까지만 하면 됨 (이후로는 2번부터 4번까지 과정 반복)
		for (int i = 0; i < 4; i++) {
			int d = i % 3; // 붓는 위치
			int a = (i + 1) % 3; // 받는 위치
			if (m[d] + m[a] > c[a]) { // 우유가 부을 때 넘치면
				m[d] = m[a] + m[d] - c[a]; // 두 우유의 합에서 받는 양동이의 수용량을 뺀 값
				m[a] = c[a]; // 수용량 만큼 넣기
			} else { // 우유를 부을 때 넘치치 않으면
				m[a] = m[a] + m[d]; // a에 다 넣기
				m[d] = 0; // d는 0
			}
		}
		for (int i : m) { // m 요소 출력 저장
			sb.append(i).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}