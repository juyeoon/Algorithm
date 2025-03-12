import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [a,b)와 [c,d)의 합집합을 구하는 문제
// 수의 범위가 100이므로 100까지의 boolean 배열을 만든 후 범위에 있는 칸을 true
// true인 개수를 출력
public class B11970_Fence_Painting {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // John의 범위 시작값
		int b = Integer.parseInt(st.nextToken()); // John의 범위 끝값
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken()); // Bessie의 범위 시작값
		int d = Integer.parseInt(st.nextToken()); // Bessie의 범위 끝값
		boolean fence[] = new boolean[101]; // 색칠한 fence 저장 배열
		for (int i = a; i < b; i++) { // John 범위 표시
			fence[i] = true;
		}
		for (int i = c; i < d; i++) { // Bessie 범위 표시
			fence[i] = true;
		}
		int cnt = 0; // 색칠한 펜스 개수
		for (boolean e : fence) { // true인 개수 세기
			if (e) {
				cnt++;
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
