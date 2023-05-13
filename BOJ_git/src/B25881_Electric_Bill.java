import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소비량에서 처음 사용량에 대한 요금을 구하고 1000이 넘어가면 추가 사용량에 대한 요금도 추가하여 총 요금을 구함
public class B25881_Electric_Bill {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // 처음 사용량에 대한 요금
		int B = Integer.parseInt(s[1]); // 추가 사용량에 대한 요금
		int N = Integer.parseInt(br.readLine()); // 고객 수
		for (int i = 0; i < N; i++) {
			int E = Integer.parseInt(br.readLine()); // 소비량
			sb.append(E).append(" ");
			if (E < 1000) {
				sb.append(E * A).append("\n"); // 총 요금(처음 사용량 이내)
			} else {
				sb.append(1000 * A + (E - 1000) * B).append("\n"); // 총 요금(추가사용량 포함)
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}