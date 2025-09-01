import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34183
// 필요한 가격 = 필요한 의자 개수 * 의자 하나당 가격 + 배송비
// = (각 팀에 필요한 의자 개수 * 3 - 현재 가지고 있는 의자 개수) * 의자 하나당 가격 + 배송비
public class B34183_SUAPC_의자_준비하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 각 팀에 필요한 의자 개수
		int M = Integer.parseInt(st.nextToken()); // 현재 가지고 있는 의자 개수
		int A = Integer.parseInt(st.nextToken()); // 의자 하나당 가격
		int B = Integer.parseInt(st.nextToken()); // 배송비
		if (N * 3 - M <= 0) { // 의자가 필요하지 않으면
			System.out.println(0); // 0원 필요
		} else { // 의자가 필요하면
			System.out.println((N * 3 - M) * A + B); // 필요한 가격 출력
		}
		br.close();
	}
}
