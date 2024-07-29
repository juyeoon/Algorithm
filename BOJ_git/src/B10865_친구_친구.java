import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 각 사람의 친구의 수를 배열에 저장하고 배열의 인덱스를 사람의 번호로, 값을 친구의 수로 저장하여 배열 출력
public class B10865_친구_친구 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 친구 수
		int M = Integer.parseInt(st.nextToken()); // 관계 수
		int friend[] = new int[N + 1]; // 친구 수 배열
		for (int i = 0; i < M; i++) { // 관계 수 만큼 반복
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken()); // 친구 A
			int B = Integer.parseInt(st.nextToken()); // 친구 B
			friend[A]++; // 친구 수 + 1
			friend[B]++; // 친구 수 + 1
		}
		for (int i = 1; i <= N; i++) { // 출력 저장
			sb.append(friend[i]).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
