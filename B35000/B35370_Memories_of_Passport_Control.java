import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 35370 - Memories of Passport Control
// https://www.acmicpc.net/problem/35370
public class B35370_Memories_of_Passport_Control {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		System.out.println(s / k + s % k);
		br.close();
	}
}
