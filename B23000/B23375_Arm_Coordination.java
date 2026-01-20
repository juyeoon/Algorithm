import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/23375
public class B23375_Arm_Coordination {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long x = Long.parseLong(st.nextToken());
		long y = Long.parseLong(st.nextToken());
		long r = Long.parseLong(br.readLine());
        long x1 = x - r, y1 = y - r;
        long x2 = x + r, y2 = y - r;
        long x3 = x + r, y3 = y + r;
        long x4 = x - r, y4 = y + r;
        sb.append(x1).append(" ").append(y1).append("\n");
        sb.append(x2).append(" ").append(y2).append("\n");
        sb.append(x3).append(" ").append(y3).append("\n");
        sb.append(x4).append(" ").append(y4).append("\n");
        System.out.println(sb);
		br.close();
	}
}
