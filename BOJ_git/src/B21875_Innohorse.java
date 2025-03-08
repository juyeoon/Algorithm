import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/21875
// 체스 말의 좌표가 이동 좌표가 주어졌을 때, 이동할 수 있는 거리를 출력하는 문제
// 각 문자를 뺀 값의 절댓값 출력
public class B21875_Innohorse {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char A[] = br.readLine().toCharArray(); // 좌표 A
		char B[] = br.readLine().toCharArray(); // 좌표 B
		int x = Math.abs(A[0] - B[0]); // 이동값 x
		int y = Math.abs(A[1] - B[1]); // 이동값 y
		System.out.println(Math.min(x, y) + " " + Math.max(x, y)); // 최솟값부터 출력
		br.close();
	}
}
