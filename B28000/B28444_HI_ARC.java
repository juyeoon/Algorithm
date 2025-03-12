import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// H*I - A*R*C 출력
public class B28444_HI_ARC {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int HI = Integer.parseInt(s[0]) * Integer.parseInt(s[1]); // H * I
		int ARC = Integer.parseInt(s[2]) * Integer.parseInt(s[3]) * Integer.parseInt(s[4]); // A * R * C
		System.out.println(HI - ARC); // HI - ARC 출력
		br.close();
	}
}