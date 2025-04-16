import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2909
// 상근이가 가지고 있는 지폐의 단위를 구한 후 사탕 가격을 round 함수를 사용해서 지폐 단위로 반올림하여 출력
public class B2909_캔디_구매 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken()); // 사탕의 가격
		double K = Math.pow(10, Integer.parseInt(st.nextToken())); // 상근이가 가지고 있는 지폐 단위
		System.out.println((int) (Math.round(C / K) * K)); // 출력
		br.close();
	}
}
