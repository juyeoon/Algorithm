import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 바구니를 1차원 배열(N+1 크기)로 만든 다음 인덱스를 값으로 넣기
// i번째 바구니와 j번째 바구니를 교환(i가 j보다 작을 때) 후 i--, j++ 
// 배열 출력
public class B10811_바구니_뒤집기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 바구니 개수
		int M = Integer.parseInt(st.nextToken()); // 뒤집는 횟수
		int num[] = new int[N + 1]; // 바구니
		for (int i = 1; i <= N; i++) { // 바구니에 값 넣기
			num[i] = i;
		}
		while (M > 0) { // 역순으로 교환
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			while (i < j) { // num[i]와 num[j] 바꾸기
				int tmp = num[i];
				num[i] = num[j];
				num[j] = tmp;
				i++;
				j--;
			}
			M--;
		}
		for (int i = 1; i <= N; i++) { // 배열 출력
			sb.append(num[i]).append(" ");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}