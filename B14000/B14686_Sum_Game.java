import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14686
// 주어진 N일 동안 두 팀인 Swifts와 Semaphores의 득점 합이 같았던 마지막 날인 K를 구하는 문제
// K일 전까지 각 팀의 득점 합이 같았을 때, 그 K 값을 출력
// 각각의 합을 구하면서 같아지면 출력값(초기값 0)을 갱신
// 마지막날까지 계산 후 출력값 출력
public class B14686_Sum_Game {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine()); // Swifts 팀 점수
        StringTokenizer st2 = new StringTokenizer(br.readLine()); // Semaphores 팀 점수
        int sum1 = 0; // Swifts 팀 누적 합
        int sum2 = 0; // Semaphores 팀 누적 합
        int K = 0; // 출력값(초기값 0)
        for (int i = 0; i < N; i++) {
            sum1 += Integer.parseInt(st1.nextToken()); // 현재 점수 더하기
            sum2 += Integer.parseInt(st2.nextToken()); 
            if(sum1 == sum2) { // 점수가 같아지면 출력값 갱신
                K = i + 1;
            }
        }
        System.out.println(K); // 출력
        br.close();
    }
}
