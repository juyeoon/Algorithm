import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// ver1 브루트포스
// 2부터 작은 수까지 돌면서 모든 수의 나머지가 0이면 추가
public class B5618_공약수_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 수 개수
		int num[] = new int[n]; // 수 배열
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) { // input num[]
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num); // 오름차순 정렬
		sb.append(1).append("\n"); // 공약수 1 추가
		if (n == 2) { // 수 2개
			for (int i = 2; i <= num[0]; i++) {
				if (num[0] % i == 0 && num[1] % i == 0) { // i가 공약수이면
					sb.append(i).append("\n");
				}
			}
		} else { // 수 3개
			for (int i = 2; i <= num[0]; i++) {
				if (num[0] % i == 0 && num[1] % i == 0 && num[2] % i == 0) { // i가 공약수이면
					sb.append(i).append("\n");
				}
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}