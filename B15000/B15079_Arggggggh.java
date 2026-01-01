import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15079
public class B15079_Arggggggh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String dir = st.nextToken();
            int d = Integer.parseInt(st.nextToken());
            double dh = d / Math.sqrt(2);
            switch (dir) {
                case "N":
                    y += d;
                    break;
                case "S":
                    y -= d;
                    break;
                case "E":
                    x += d;
                    break;
                case "W":
                    x -= d;
                    break;
                case "NE":
                    x += dh;
                    y += dh;
                    break;
                case "NW":
                    x -= dh;
                    y += dh;
                    break;
                case "SE":
                    x += dh;
                    y -= dh;
                    break;
                case "SW":
                    x -= dh;
                    y -= dh;
                    break;
            }
        }
        System.out.printf("%.8f %.8f", x, y);
        br.close();
    }
}
