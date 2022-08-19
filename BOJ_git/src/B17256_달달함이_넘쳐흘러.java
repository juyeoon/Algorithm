import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제에서 주어진 식을 이항하여 정리한 수식 사용
public class B17256_달달함이_넘쳐흘러 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int ax = Integer.parseInt(s[0]);
		int ay = Integer.parseInt(s[1]);
		int az = Integer.parseInt(s[2]);
		s = br.readLine().split(" ");
		int cx = Integer.parseInt(s[0]);
		int cy = Integer.parseInt(s[1]);
		int cz = Integer.parseInt(s[2]);
		// bx = cx - az, by = cy / ay, bz = cz - ax
		System.out.println((cx - az) + " " + (cy / ay) + " " + (cz - ax)); // 출력
	}
}
