import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 3554 - Enigmatic Device
// https://www.acmicpc.net/problem/3554
public class B3554_Enigmatic_Device {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while ((s = br.readLine()) != null) {
			s = s.replace("iiing", "th");
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}
