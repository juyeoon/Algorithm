import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// C일 후 오후가 A일 후 오전과 B일 후 오후 사이에 있으면 1, 그 외에는 0 출력
public class B24072_帰省_Homecoming {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int C = Integer.parseInt(s[2]);
		System.out.println((C >= A && C < B) ? 1 : 0);
		br.close();
	}
}