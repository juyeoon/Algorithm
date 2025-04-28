import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/29342
// 수직선 위의 좌표로 위치가 주어지고, 
// 같은 팀 클론끼리는 거리(차이)가 짝수, 다른 팀 클론끼리는 거리(차이)가 홀수일 때,
// 싸울 수 있는 클론 쌍(다른 팀에 속한 쌍)의 총 개수를 구하는 문제
// 싸울 수 있는 경우는 짝수 클론과 홀수 클론을 각각 하나씩 선택하는 것
// 따라서 정답은 (짝수 클론 수) × (홀수 클론 수)
public class B29342_Война_клонов {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 전체 클론 수 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int even = 0; // 짝수 클론 수
        int odd = 0; // 홀수 클론 수
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a % 2 == 0) { // 짝수 
                even++;
            } else { // 홀수
                odd++;
            }
        }
        System.out.println((long) even * odd); // 출력
        br.close();
    }
}
