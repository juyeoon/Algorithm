import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31831
// 브루트포스로 맥주 부피와 같은 냉장고 부피를 만들 수 있는 크기 찾기
// 범위가 크기 때문에 반복문마다 범위 초과 확인 필요
public class B3595_맥주_냉장고 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 냉장고에 넣을 맥주 개수
        long min = Long.MAX_VALUE; // 최소 겉넓이 (/2)
        int ans[] = new int[3]; // 최소 겉넓이를 가지는 육면체 크기
         for (int i = 1; i <= n; i++) { // [0]
            for (int j = 1; j <= i; j++) { // [1]
                if (i * j > n) { // 범위 초과
                    break;
                }
                for (int k = 1; k <= j; k++) { // [2]
                    if (i * j * k > n) { // 범위 초과
                        break;
                    }
                    if (i * j * k == n) { // 범위 가능
                        long sum = i * j + j * k + k * i; // 겉넓이 / 2
                        if (sum < min) { // 최소 겉넓이 갱신
                            min = sum;
                            ans[0] = i;
                            ans[1] = j;
                            ans[2] = k;
                        }
                    }
                }
            }
         }
        System.out.println(ans[0] + " " + ans[1] + " " + ans[2]); // 출력
        br.close();
    }
}
