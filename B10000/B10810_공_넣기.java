import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// i부터 j 바구니까지 k번으로 바꾸기
// N + 1 사이즈의 1차원 배열에 인덱스 i부터 j까지의 값을 k로 바꾸기
public class B10810_공_넣기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 바구니 개수
		int M = Integer.parseInt(st.nextToken()); // 공 넣는 방법 수
		int num[] = new int[N + 1]; // 바구니 배열
		for (int l = 0; l < M; l++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()); // 인덱스 시작
			int j = Integer.parseInt(st.nextToken()); // 인덱스 끝
			int k = Integer.parseInt(st.nextToken()); // 번호
			while (i <= j) { // 배열에 값 k 넣기
				num[i] = k;
				i++;
			}
		}
		for (int l = 1; l <= N; l++) { // 배열 값 출력
			sb.append(num[l]).append(" ");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}