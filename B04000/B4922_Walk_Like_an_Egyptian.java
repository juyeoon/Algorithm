import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 4922 - Walk Like an Egyptian
// https://www.acmicpc.net/problem/4922
public class B4922_Walk_Like_an_Egyptian {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        String s = "";
        while (!(s = br.readLine()).equals("0")){
            int N = Integer.parseInt(s);
            long result = 1L * N * N - N + 1;
            sb.append(N).append(" => ").append(result).append("\n");
        }
        System.out.print(sb);
		br.close();
	}
}
