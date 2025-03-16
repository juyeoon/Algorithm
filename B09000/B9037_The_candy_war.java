import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/9037
// 가지고 있는 사탕의 수와 옆으로 넘길 사탕의 수를 각각 배열에 저장
// 반복문으로 작업 순회
// 1. 모두 같은 수의 사탕을 가지는지 확인 => 모두 같으면 반복 끝
// 2. 옆으로 넘길 사탕의 수 구하기
// 3. 사탕 넘기기
// 4. 홀수 처리
public class B9037_The_candy_war {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); // 테스트케이스
        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine()); // 인원 수
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] candy = new int[N]; // 가지고 있는 사탕의 수
            int[] pass = new int[N]; // 옆으로 넘길 사탕의 수
            for (int i = 0; i < N; i++) { // 초기 사탕 수 저장
                candy[i] = Integer.parseInt(st.nextToken());
                if (candy[i] % 2 == 1) { // 홀수 처리
                    candy[i]++;
                }
            }
            int cnt = 0; // 반복 횟수
            while (true) {
                // 1. 모두 같은 수의 사탕을 가지는지 확인
                int first = candy[0];
                boolean same = true;
                for (int i = 1; i < N; i++) {
                    if (first != candy[i]) {
                        same = false;
                        break;
                    }
                }
                if (same) { // 모두 같은 수의 사탕을 가지면 반복 끝
                    break;
                }
                // 2. 옆으로 넘길 사탕의 수 구하기
                for (int i = 0; i < N; i++) {
                    pass[i] = candy[i] / 2;
                }
                // 3. 사탕 넘기기
                candy[0] = pass[0] + pass[N - 1];
                for (int i = 1; i < N; i++) {
                    candy[i] = pass[i] + pass[i - 1];
                }
                // 4. 홀수 처리
                for (int i = 0; i < N; i++) {
                    if (candy[i] % 2 == 1) {
                        candy[i]++;
                    }
                }
                cnt++; // 반복 횟수 카운트
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb); // 출력
        br.close();
    }
}
