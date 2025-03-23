import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/23530
// a+b의 결과값이 아닌 값을 출력하는 문제
// a와 b의 범위와 a+b=c의 범위를 고려햇을 때 a+b는 절대 1이 나올 수 없기 때문에 모든 테스트케이스에 대해서 1을 출력
public class B23530_Not_A_plus_B {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < t; tc++) {
			sb.append("1\n"); // 1 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
