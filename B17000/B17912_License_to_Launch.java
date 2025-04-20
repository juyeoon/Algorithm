import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17912
// 주어진 수 중 최솟값의 위치를 찾는 문제
public class B17912_License_to_Launch {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 입력 수의 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.MAX_VALUE; // 최솟값
		int minIdx = 0; // 최솟값의 위치
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken()); // 현재의 수
			if (min > tmp) { // 최솟값 갱신
				min = tmp;
				minIdx = i;
			}
		}
		System.out.println(minIdx); // 출력
		br.close();
	}
}
