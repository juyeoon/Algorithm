import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/6318
public class B6318_Box_of_Bricks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";
        int setNo = 1;
        while (!(s = br.readLine()).equals("0")) {
            int n = Integer.parseInt(s);
            int[] h = new int[n];
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(st.nextToken());
                sum += h[i];
            }
            int avg = sum / n;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (h[i] > avg) {
                    cnt += (h[i] - avg);
                }
            }
            sb.append("Set #").append(setNo++).append("\n");
            sb.append("The minimum number of moves is ").append(cnt).append(".\n\n");
        }
        System.out.print(sb);
    }
}
