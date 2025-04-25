import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.Math;

// https://www.acmicpc.net/problem/9724
// 주어진 범위 내에서 완전한 세제곱수의 개수를 구하는 문제
// A의 세제곱근과 B의 세제곱근을 찾아 구하기
public class B9724_Perfect Cube {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); // 테스트케이스
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken()); 
            long B = Long.parseLong(st.nextToken());
            long cubeRootMin = (long) Math.ceil(Math.cbrt(A)); // 세제곱수 범위 계산
            long cubeRootMax = (long) Math.floor(Math.cbrt(B));
            long result = cubeRootMax - cubeRootMin + 1; // 완전한 세제곱수의 개수는 x_min과 x_max 사이의 정수 개수
            if (result < 0) { // 범위 내에 완전한 세제곱수가 없음
                result = 0;
            }
            sb.append("Case #").append(t).append(": ").append(result).append("\n"); // 출력 저장
        }
        System.out.print(sb); // 출력
        br.close();
    }
}
