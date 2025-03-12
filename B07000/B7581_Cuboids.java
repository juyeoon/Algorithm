import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/7581
// 직육면체의 부피 = 길이 * 너비 * 높이 식을 변형하여 구하기
public class B7581_Cuboids {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";
        while (!(s = br.readLine()).equals("0 0 0 0")) { // EOI
            StringTokenizer st = new StringTokenizer(s);            
            int l = Integer.parseInt(st.nextToken()); // 길이
            int w = Integer.parseInt(st.nextToken()); // 너비
            int h = Integer.parseInt(st.nextToken()); // 높이
            int v = Integer.parseInt(st.nextToken()); // 부피
            if (v == 0) { // 부피 계산
                v = l * w * h;
            } 
            else if (l == 0) { // 길이 계산
                l = v / (w * h);
            }
            else if (w == 0) { // 너비 계산
                w = v / (l * h);
            }
            else if (h == 0) { // 높이 계산
                h = v / (l * w);
            }
            sb.append(l).append(" ").append(w).append(" ").append(h).append(" ").append(v).append("\n"); // 출력 저장
        }
        System.out.print(sb.toString()); // 출력
	br.close();
    }
}