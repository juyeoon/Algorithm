import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A, B, C 중 최댓값 * 3에서 A + B + C 빼기
public class B22015_金平糖_Konpeito {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int C = Integer.parseInt(s[2]);
		int max = Math.max(A, Math.max(B, C)); // A, B, C 중 최댓값
		System.out.println(max * 3 - (A + B + C)); // 최소로 더 필요한 개수
		br.close();
	}
}