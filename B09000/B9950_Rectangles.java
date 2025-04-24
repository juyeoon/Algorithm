import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/9950
// 면적 a = 길이 l *  너비 w
public class B9950_Rectangles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";
        while (!(s = br.readLine()).equals("0 0 0")) { // EOI
            StringTokenizer st = new StringTokenizer(s);
            int l = Integer.parseInt(st.nextToken()); // 직사각형의 길이
            int w = Integer.parseInt(st.nextToken()); // 직사각형의 너비
            int a = Integer.parseInt(st.nextToken()); // 직사각형의 넓이
            if (l == 0) { // 길이가 없을 경우, 길이를 계산
                l = a / w;
            } else if (w == 0) { // 너비가 없을 경우, 너비를 계산
                w = a / l;
            } else if (a == 0) { // 면적이 없을 경우, 면적을 계산
                a = l * w;
            }
            sb.append(l).append(" ").append(w).append(" ").append(a).append("\n"); // 출력 저장
        }
        System.out.println(sb); // 출력
        br.close();
    }
}
