import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/30310
// 비어 있는 칸이 최소 2칸이 되려면 어떤 두 타입의 포크를 전부 식기세척기에 넣어야 함
// => 전체에서 최소 개수 두 개를 골라 합한 값을 출력
public class B30310_Finding_Forks {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 포크 종류 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		long min1 = Long.MAX_VALUE; // 최솟값
		long min2 = Long.MAX_VALUE; // 두 번째 최솟값
		for (int i = 0; i < n; i++) { // 최소 개수 2개 찾기
			long a = Long.parseLong(st.nextToken()); // 현재 종류의 포크 개수
			if (a < min1) {
				min2 = min1;
				min1 = a;
			} else if (a < min2) {
				min2 = a;
			}
		}
		System.out.println(min1 + min2); // 출력
		br.close();
	}
}
