import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/13073
// 첫 번째 N개의 양의 정수의 합 => N * (N + 1) / 2
// 첫 번째 N개의 홀수 정수의 합 => N * N
// 첫 번째 N개의 짝수 정수의 합 => N * (N + 1)
public class B13073_Sums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); // 테스트케이스스
        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine()); // 정수
            int S1 = N * (N + 1) / 2; // 첫 번째 N개의 양의 정수의 합
            int S2 = N * N; // 첫 번째 N개의 홀수 정수의 합
            int S3 = N * (N + 1); // 첫 번째 N개의 짝수 정수의 합
            sb.append(S1).append(" ").append(S2).append(" ").append(S3);
        }
        System.out.println(sb); // 출력
        br.close();
    }
}
