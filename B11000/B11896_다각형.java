import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11896
// n이 4이상의 짝수일 때만 가능
// 등차가 2인 등차수열의 합으로 생각하고 합을 구하기 위해 시작(start)를 4이상인 짝수로 맞추고 end도 짝수로 맞춘 후,
// 항의 개수를 구한 후 등차수열의 합공식을 사용하여 구함
public class B11896_다각형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int start = Math.max(a, 4); // 시작 항
		if (start % 2 != 0) {
			start++;
		}
		int end = b; // 마지막 항
		if (end % 2 != 0) {
			end--;
		}
		long sum = 0; // 합
		if (start <= end) {
			long k = (end - start) / 2 + 1; // 항 개수
			sum = k * (start + end) / 2; // 등차수열 합공식
		}
		System.out.println(sum); // 출력
		br.close();
	}
}
