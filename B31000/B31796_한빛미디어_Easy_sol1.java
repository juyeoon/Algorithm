import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

// https://www.acmicpc.net/problem/31796
// sol1) 다이나믹프로그래밍 문제인 줄 알고 dp로 풂. 
// 시간이 너무 오래 걸려서 생각해보니 로직상 모든 요소에 대해 최솟값을 구할 필요가 없었음 → sol2
// dp로 생각한 이유: 1) 그룹의 최소 개수를 구하는 문제라서 오름차순으로 정렬했을 때 뒤에서부터 요소를 하나씩 추가하면서 그룹을 바꿔가면 결국 모든 값이 그룹에 있을 때의 최솟값을 구할 수 있을 거라 생각
// 2) 두 배 이상이 되는 부분에서 이후의 값에 대해서 또 그룹의 최소 개수를 구하는 문제라서
// 시간: 1312 ms
public class B31796_한빛미디어_Easy_sol1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 가격 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int price[] = new int[N]; // 가격
        for (int i = 0; i < N; i++) { // price[] 채우기
            price[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(price); // 가격 오름차순 정렬
        int dp[] = new int[N]; // dp값 저장
        for (int i = N - 1; i >= 0; i--) { // 뒤에서부터 dp 계산
            int doublePrice = price[i] * 2; // 현재 가격의 두 배 가격
            int idx = i;
            while(idx < N && price[idx] < doublePrice){ // 두 배 이상이 되는 가격 찾기
                idx++;
            }
            dp[i] = 1; // 현재 가격의 두 배 이전까지 그룹 하나
            if(idx < N){ // 뒤에 그룹이 또 있으면
                dp[i] += dp[idx]; // 그 그룹에 대한 최솟값 출력
            }

        }
        System.out.println(dp[0]); // 출력
        br.close();
    }
}
