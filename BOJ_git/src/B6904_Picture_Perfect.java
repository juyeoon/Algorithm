import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 넓이의 약수(한 변의 길이)를 구하고 다른 한 변의 길이와 합이 최솟값보다 작으면 최소값으로 갱신
public class B6904_Picture_Perfect {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOI
			int n = Integer.parseInt(s); // 주어진 넓이
			int min = Integer.MAX_VALUE; // 최소 둘레 (가로 + 세로)
			int a = Integer.MAX_VALUE; // 최소 둘레를 가지는 가로의 길이
			int sqrt = (int) Math.sqrt(n); // n의 제곱근(반복문 종료 조건)
			for (int i = 1; i <= sqrt; i++) { // 한 변의 길이를 하나씩 늘리면서 확인
				if (n % i == 0) { // 한 변의 길이로 가질 수 있으면
					int b = n / i; // 다른 한 변의 길이
					if (min > i + b) { // 현재의 최솟값보다 작으면
						min = i + b; // 최솟값 갱신
						a = i;
					}
				}
			}
			// 출력 저장
			sb.append("Minimum perimeter is ").append(min * 2).append(" with dimensions ");
			sb.append(a).append(" x ").append((int) (n / a)).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}