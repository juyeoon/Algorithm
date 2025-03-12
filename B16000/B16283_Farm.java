import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 염소의 수를 i, 양의 수를 n-i라고 했을 때
// 사료와 동물 수에 대한 방정식은 a * i + (n - i) * b == w
// 염소의 수를 1부터 n-1까지 위의 방정식에 대입하면서 가능한 i가 존재하는지 확인
// 존재하지 않거나 2개 이상 존재할 경우 -1, 아니면 염소와 양의 수 출력
public class B16283_Farm {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // 양 한 마리가 먹는 사료의 양
		int b = Integer.parseInt(st.nextToken()); // 염소 한 마리가 먹는 사료의 양
		int n = Integer.parseInt(st.nextToken()); // 양과 염소 전체 마리 수
		int w = Integer.parseInt(st.nextToken()); // 하루 동안 소비한 전체 사료의 양
		int goat = 0; // 염소의 수 (양의 수 = n-goat)
		boolean exist = false; // 가능한 해의 존재 여부(true: 존재)
		for (int i = 1; i < n; i++) { // 염소의 수는 1부터 n-1까지 가능
			if (a * i + (n - i) * b == w) { // 조건에 맞는 염소의 수가 존재하면
				if (!exist) { // 이전에 구한 해가 없으면
					goat = i; // 염소의 수를 저장
					exist = true; // 해의 존재 표시
				} else { // 이전에 구한 해가 있으면 가능한 해가 2개 이상
					goat = -1; // 표시
					break; // 반복문 탈출
				}
			}
		}
		if (goat <= 0) { // 염소의 수가 0: 가능한 해가 없음. -1: 가능한 해가 2개 이상
			System.out.println(-1);
		} else { // 가능한 해가 1개 존재
			System.out.println(goat + " " + (n - goat)); // 염소와 양의 수 출력
		}
		br.close();
	}
}