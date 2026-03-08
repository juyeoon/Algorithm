import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 35373 - A Little Leftover Pizza 
// https://www.acmicpc.net/problem/35373
public class B35373_A_Little_Leftover_Pizza {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int smallSum = 0;
        int mediumSum = 0;
        int largeSum = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String size = st.nextToken();
            int leftover = Integer.parseInt(st.nextToken());
            if (size.equals("S")) {
                smallSum += leftover;
            } else if (size.equals("M")) {
                mediumSum += leftover;
            } else {
                largeSum += leftover;
            }
        }
        int answer = 0;
        answer += (smallSum + 5) / 6;
        answer += (mediumSum + 7) / 8;
        answer += (largeSum + 11) / 12;
        System.out.println(answer);
		br.close();
	}
}
