import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/33179
// 새로운 장이 홀수 페이지로 시작할 수 있게 만들 때 필요한 장수를 구하는 문제
// 각 장의 페이지 수가 홀수일 때, 빈 페이지를 추가하여 짝수 페이지로 만듦
// 짝수일 때, 그대로
// 짝수 페이지를 반으로 나눈 장 수가 필요
public class B33179_Hezardastans_Annual_Report {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 총 페이지 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0; // 총 장 수
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(st.nextToken()); // 페이지 수
            if (p % 2 != 0) { // 홀수면 빈 페이지 추가
                p++;
            }
            sum += p / 2; // 총 합에 장 수 추가
        }
        System.out.println(sum); // 출력
    }
}
