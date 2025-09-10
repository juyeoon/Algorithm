import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34236
// N+1번째로 열릴 연도  = (N번째로 열린 연도 - N-1번째로 열린 연도) + N번째로 열린 연도
// = 2 * N번째로 열린 연도 - N-1번째로 열린 연도
public class B34236_숭고한에_어서오세요 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 대회가 열린 연도의 개수
		String s[] = br.readLine().split(" "); // 대회가 열린 연도 배열
		int AN1 = Integer.parseInt(s[N - 2]); // N-1번째로 열린 연도
		int AN2 = Integer.parseInt(s[N - 1]); // N번째로 열린 연도
		System.out.println(2 * AN2 - AN1); // N+1번째로 열릴 연도
		br.close();
	}
}
