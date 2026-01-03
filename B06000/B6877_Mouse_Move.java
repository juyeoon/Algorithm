import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/6877
public class B6877_Mouse_Move {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int x = 0;
        int y = 0;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) {
                break;
            }
            x += a;
            y += b;
            if (x < 0) {
                x = 0;
            } else if (x > c) {
                x = c;
            }
            if (y < 0) {
                y = 0;
            } else if (y > r) {
                y = r;
            }
            sb.append(x).append(" ").append(y).append("\n"); // 이동 후 좌표 출력
        }
        System.out.print(sb);
        br.close();
    }
}
