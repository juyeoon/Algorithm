import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

// ver2 유클리드 호제법으로 최대공약수 구한 후 최대공약수의 약수 출력
public class B5618_공약수_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int num[] = new int[n];
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) { // input num[]
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num); // 오름차순으로 정렬
		int gcd = 0; // 최대공약수
		if (n == 3) { // 수 3개 최대공약수 구하기
			gcd = GCD(num[2], num[1]);
			gcd = GCD(gcd, num[0]);
		} else { // 수 2개 최대공약수 구하기
			gcd = GCD(num[1], num[0]);
		}
		Set<Integer> commonFactor = new TreeSet<>(); // 최대공약수 저장(제곱근 중복을 피하기 위해 Set 사용)
		for (int i = 1; i * i <= gcd; i++) { // 최대공약수의 공약수를 구하기
			if (gcd % i == 0) {
				commonFactor.add(i); // 공약수 중 작은 수
				commonFactor.add(gcd / i); // 공약수 중 큰 수
			}
		}
		for (Integer i : commonFactor) { // 공약수 출력
			sb.append(i).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}

	private static int GCD(int a, int b) {
		if (b > a) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		while (b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}
}