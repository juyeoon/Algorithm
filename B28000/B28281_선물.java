import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 0부터 N-2까지(i) 돌면서 i날짜와 i+1날짜의 양말값과 현재의 최솟값을 비교하며 최솟값 갱신
public class B28281_선물 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 생일까지 남은 일 수
		int X = Integer.parseInt(st.nextToken()); // 하루에 살 양말 개수
		st = new StringTokenizer(br.readLine());
		int A[] = new int[N]; // 날마다의 가격
		for (int i = 0; i < N; i++) { // input A[]
			A[i] = Integer.parseInt(st.nextToken());
		}
		int min = Integer.MAX_VALUE; // 2X개 양말의 최솟값
		for (int i = 0; i < N - 1; i++) { // 최솟값 구하기
			min = Math.min(min, A[i] * X + A[i + 1] * X); // 최솟값 갱신
		}
		System.out.println(min); // 출력
		br.close();
	}
}