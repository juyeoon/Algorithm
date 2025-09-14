import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34346
// 격자 크기가 홀수면 양쪽 대각선이 만나는 한 칸이 있으므로 그 칸만 칠하면 됨 (1 출력)
// 짝수면 양쪽 대각선이 만나는 칸이 없으므로 각각 대각선에 한 칸씩 칠해야 함 (2 출력)
public class B34346_대각선 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 격자 크기
		System.out.println((N % 2 == 0) ? 2 : 1); // 출력
		br.close();
	}
}
