import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 6번째 항부터 P(6) = P(1) + P(6-1), P(7) = P(2) + P(7-1), ...
// N이 100까지이므로 크기가 101인 long(int로는 부족) 배열을 만들고 N=1,2,3,4,5의 초기값을 저장
// N>=6부터 배열을 채우는데 N까지 채움
// 테스트 케이스가 여러 개일 수 있으므로 계산한 마지막 idx를 저장하는 변수와 식을 구할 때 사용하는 1부터 시작하는 변수를 사용
// 만약 마지막 idx보다 N이 작으면 그냥 배열에 있는 값 출력
// N이 더 크면 위의 식을 사용해서 N까지의 값을 구함
public class B9461_파도반_수열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		long[] a = new long[101]; // 수열의 값
		// 초기값 저장
		a[1] = 1;
		a[2] = 1;
		a[3] = 1;
		a[4] = 2;
		a[5] = 2;
		int lastIdx = 6; // 마지막 계산 idx를 가리킴
		int num1 = 1; // 식에서 사용할 idx
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 항
			while (lastIdx <= N) { // N까지의 항을 구함
				a[lastIdx] = a[num1] + a[lastIdx - 1];
				lastIdx++;
				num1++;
			}
			sb.append(a[N]).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}