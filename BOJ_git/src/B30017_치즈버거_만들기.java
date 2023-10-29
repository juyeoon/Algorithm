import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 경우 1) 최대로 넣고도 패티가 남거나 딱 맞을 때 => (치즈 개수 + 1) + 치즈 개수
// 경우 2) 최대로 넣고도 치즈가 남을 때 => 패티 개수 + (패티 개수 - 1)
public class B30017_치즈버거_만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // 패티 개수
		int B = Integer.parseInt(s[1]); // 치즈 개수
		if (A >= B + 1) { // 최대로 넣고도 패티가 남거나 딱 맞을 때
			System.out.println(B + 1 + B); // (치즈 개수 + 1) + 치즈 개수
		} else { // 최대로 넣고도 치즈가 남을 때
			System.out.println(A + A - 1); // 패티 개수 + (패티 개수 - 1)
		}
		br.close();
	}
}