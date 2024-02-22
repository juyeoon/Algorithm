import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// N 제곱근만큼 반복하여 소인수를 찾고 해당 수가 제곱이 몇번 된는지 찾기 
public class B11653_소인수분해 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 정수 N
		int end = (int) Math.sqrt(N); // N 제곱근(반복문에 사용하기 위함)
		for (int i = 2; i <= end; i++) {
			if (N == 1) { // 소인수분해 끝
				break;
			}
			while (N % i == 0) { // i로 소인수분해가 가능하면 제곱이 얼마만큼 들어가는지 확인
				sb.append(i).append("\n"); // 출력에 추가
				N /= i;
			}
		}
		if (N != 1) { // 반복문 끝났을 때 1이 아니면 소수
			sb.append(N).append("\n"); // 출력에 자기 자신 추가
		}
		bw.write(sb.toString()); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}