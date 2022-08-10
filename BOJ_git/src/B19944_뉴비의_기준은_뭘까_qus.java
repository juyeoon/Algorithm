import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단순 구현
public class B19944_뉴비의_기준은_뭘까_qus {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 올드비 기준
		int M = Integer.parseInt(s[1]); // 학년
		if (M <= 2) { // 2학년 이하면 뉴비
			System.out.println("NEWBIE!");
		} else if (M <= N) { // 3학년 이상 N학년 이하면 올드비
			System.out.println("OLDBIE!");
		} else { // 그 외
			System.out.println("TLE!");
		}
		br.close();
	}
}