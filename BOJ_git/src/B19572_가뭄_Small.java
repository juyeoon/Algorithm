import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/19572
// 삼차방정식의 해를 구하는 문제
// 문제를 정리하면 a+b = d1, a+c = d2, b+c = d3
// a = (d1 + d2 - d3) / 2, b = (d1 + d3 - d2) / 2, c = (d2 + d3 - d1) / 2
public class B19572_가뭄_Small{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double d1 = Double.parseDouble(st.nextToken());
        double d2 = Double.parseDouble(st.nextToken());
        double d3 = Double.parseDouble(st.nextToken());
        double a = (d1 + d2 - d3) / 2;
        double b = (d1 + d3 - d2) / 2;
        double c = (d2 + d3 - d1) / 2;
        if (a > 0 && b > 0 && c > 0) { // a, b, c가 양의 실수일 때
            System.out.println(1);
            System.out.printf("%.1f %.1f %.1f\n", a, b, c); // 소수 첫째 자리까지 반올림
        } else { // 양의 실수가 아닐 때
            System.out.println(-1);
        }
    }
}
