import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 각 학생에 대한 친구의 수를 배열로 저장 
// 친구 관계인 학생의 번호를 받고 각 학생의 친구의 수를 + 1
// => 결국 친구 관계에서 번호가 등장한 횟수와 동일
public class B10864_친구 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 반 학생 수
		int M = Integer.parseInt(st.nextToken()); // 친구 관계 수
		int cnt[] = new int[N + 1]; // 학생 당 친구의 수(idx: 학생 번호, value: 친구의 수)
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine()); // 친구 관계인 두 학생 a b
			cnt[Integer.parseInt(st.nextToken())]++; // a의 친구 수 + 1
			cnt[Integer.parseInt(st.nextToken())]++; // b의 친구 수 + 1
		}
		for (int i = 1; i <= N; i++) { // 친구 수 출력 저장
			sb.append(cnt[i]).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}