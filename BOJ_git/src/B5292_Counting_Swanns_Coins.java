import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/5292
// 반복문을 1부터 N까지 돌리며 3과 5의 배수인지 확인
// 데이터 중 공백이 들어간 수가 있기 때문에 trim 사용
public class B5292_Counting_Swanns_Coins {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine().trim());
		for (int i = 1; i <= N; i++) {
			if (i % 15 == 0) { // 3과 5의 배수
				sb.append("DeadMan\n");
			} else if (i % 3 == 0) { // 3의 배수
				sb.append("Dead\n");
			} else if (i % 5 == 0) { // 5의 배수
				sb.append("Man\n");
			} else { // 그 외
				sb.append(i).append(" ");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
