import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

// n의 제곱근을 이용하여 약수를 구함(반복되는 수를 줄이기 위해)
public class B9506_약수들의_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0; // 약수를 구할 수
		while ((n = Integer.parseInt(br.readLine())) != -1) { // n이 -1이 아니면 반복
			double sqrtN = Math.sqrt(n); // n의 제곱근 - 약수를 구할 때 사용
			LinkedList<Integer> list = new LinkedList<>(); // 약수 저장
			list.add(1); // 자기 자신이 아닌 약수들을 구하기 위해 1은 따로 저장
			int sum = 1; // 자기 자신이 아닌 약수들의 합
			for (int i = 2; i < sqrtN; i++) { // 2부터 n의 제곱근 중에 n으로 나눴을 때의 나머지가 0인 것을 찾고 그 수와 짝이 되는 수도 함께 찾는다
				if (n % i == 0) { // n으로 나눴을 때의 나머지가 0인 수
					list.add(i); // 수 저장
					list.add(n / i); // 짝이 되는 수 저장
					sum += i + n / i; // 합 갱신
				}
			}
			if (n % sqrtN == 0) { // 제곱근이 약수일 때(두 번 저장되는 것을 방지하기 위해서 따로 연산)
				list.add((int) sqrtN); // 수 저장
				sum += (int) sqrtN; // 합 갱신
			}
			if (sum != n) { // 약수들의 합이 n과 같지 않으면
				sb.append(n).append(" is NOT perfect.\n");
			} else { // 약수들의 합이 n과 같으면
				Collections.sort(list); // 약수 정렬
				// 출력 형식에 맞게 sb에 추가
				sb.append(n).append(" = ");
				for (int i = 0; i < list.size() - 1; i++) {
					sb.append(list.get(i)).append(" + ");
				}
				sb.append(list.get(list.size() - 1)).append("\n");
			}
		}
		System.out.println(sb); // 출력ㄴ
		br.close();
	}
}
