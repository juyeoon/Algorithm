import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26529
// dp로 입력받은 개월 수까지 계산한 후 저장하고, 다음 입력값이 계산된 범위 내에 있으면 미리 계산된 값 출력
public class B26529_Bunnies {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 테스트케이스
		int[] fn = new int[46]; // 피보나치 수열
		fn[0] = 1; // 초기값
		fn[1] = 1; // 초기값
		int lastIdx = 1; // 피보나치 수열이 계산된 마지막 인덱스
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine()); // 개월 수
			if (lastIdx < x) { // 아직 계산이 안 됐으면 계산
				for (int j = lastIdx + 1; j <= x; j++) {
					fn[j] = fn[j - 1] + fn[j - 2];
				}
				lastIdx = x; // 마지막 인덱스 갱신
			}
			sb.append(fn[x]).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
