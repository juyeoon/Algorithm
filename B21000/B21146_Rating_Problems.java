import java.io.*;
import java.util.*;

public class B21146_Rating_Problems {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += Integer.parseInt(br.readLine());
        }
        int remaining = n - k;
        double minAvg = (sum + remaining * (-3)) / (double) n;
        double maxAvg = (sum + remaining * 3) / (double) n;
        System.out.printf("%f %f\n", minAvg, maxAvg);
    }
}
