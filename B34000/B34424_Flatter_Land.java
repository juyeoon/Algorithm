import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34424
// n명의 사람이 x만큼 떨어져 있을 때 사람들 사이의 총 거리를 구하는 문제
public class B34424_Flatter_Land {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 사람의 수
		int x = Integer.parseInt(br.readLine()); // 사람들 사이의 권장 거리
		System.out.println((n - 1) * x); // 출력
		br.close();
	}
}
