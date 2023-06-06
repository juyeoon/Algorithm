import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// K 이하의 소수를 모두 구하고 P가 K 이하의 소수로 나누어 떨어지면 BAD, K 이하의 모든 소수로 나누어 떨어지지 않으면 GOOD을 출력
public class B1837_암호제작 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		BigInteger P = new BigInteger(s[0]); // 암호 P
		int K = Integer.parseInt(s[1]); // 기준 K
		boolean notPrime[] = new boolean[K + 1]; // K 이하의 자연수의 소수 판별(true: 합성수)
		notPrime[0] = true;
		notPrime[1] = true;
		for (int i = 2; i <= Math.sqrt(K); i++) { // 소수 판별
			if (notPrime[i]) { // 이미 소수가 아니라고 판별한 경우
				continue; // 다음 수로
			}
			for (int j = i * i; j < notPrime.length; j += i) { // 배수를 합성수로 처리
				notPrime[j] = true;
			}
		}
		for (int i = 2; i < K; i++) { // P가 좋은 암호인지 아닌지 판별
			if (notPrime[i]) { // i가 소수가 아닌 경우 다음 수로
				continue;
			}
			// i가 소수이고 P를 i로 나누었을 때 나머지가 0이면 좋지 않은 암호
			if (P.mod(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) == 0) { 
				sb.append("BAD ").append(i);
				break;
			}
		}
		if (sb.length() == 0) { // 반복문이 끝날 때까지 sb에 저장된 것이 없으면 좋은 암호
			sb.append("GOOD");
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}
