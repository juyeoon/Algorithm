import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 32184 - 디미고에 가고 싶어!
// https://www.acmicpc.net/problem/32184
// 현재 페이지(cur)를 왼쪽부터 훑으면서 마지막 페이지 하나만 남으면 세로 촬영
// cur이 홀수면 (cur, cur+1) 두 페이지를 가로 촬영
// cur이 짝수면 cur만 세로 촬영
// 촬영할 때마다 cnt를 증가시키고 cur을 다음 처리할 페이지로 갱신하여 반복
public class B32184_디미고에_가고_싶어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // ecode가 사진을 촬영하려고 하는 부분의 시작 페이지
        int B = Integer.parseInt(st.nextToken()); // 끝 페이지
        int cnt = 0; // 사진 찍은 횟수
        int cur = A; // 현재 페이지
        while (cur <= B) { // 마지막 한 페이지만 남은 경우 → 세로 촬영
            if (cur == B) {
                cnt++;
                break;
            }
            if (cur % 2 == 1) { // 홀수 페이지 → (cur, cur+1) 한 면으로 가로 촬영 가능
                cnt++;
                cur += 2; 
            } else { // 짝수 페이지 → 세로로 cur만 찍고 다음 페이지로
                cnt++;
                cur++;
            }
        }
        System.out.println(cnt); // 출력
    }
}
