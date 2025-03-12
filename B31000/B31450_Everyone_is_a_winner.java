import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 전체 메달 수를 아이들 수로 나눈 나머지가 0이면 모두 같은 개수(몫)로 가져갈 수 있음
public class B31450_Everyone_is_a_winner {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()); // 메달 수
		int K = Integer.parseInt(st.nextToken()); // 아이들 수
		System.out.println(M % K == 0 ? "Yes" : "No"); // 출력
		br.close();
	}
}