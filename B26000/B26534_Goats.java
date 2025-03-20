import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/26534
// 두 주사위 조합의 모든 경우의 수(6*6)를 돌려보면서 첫번째가 두번째를 이기는 횟수와 비기는 횟수를 카운트
// (이긴 횟수 / 전체 경우의 수에서 비기는 경우를 뺀 횟수)을 반올림하여 출력
public class B26534_Goats {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dice1[] = new int[6]; // 첫번째 주사위
        for (int i = 0; i < 6; i++) { // 배열에 입력
            dice1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int dice2[] = new int[6]; // 두번째 주사위
        for (int i = 0; i < 6; i++) { // 배열에 입력
            dice2[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0; // 첫번째가 두번째를 이긴 횟수
        int same = 0; // 비긴 횟수
        for (int i = 0; i < 6; i++) { // 가위바위보 시행
            for (int j = 0; j < 6; j++) {
                if(dice1[i] > dice2[j]) { 
                    cnt++;
                } else if(dice1[i] == dice2[j]){
                    same++;
                }
            }
        }
        int total = 36 - same; // 총 경우의 수에서 비긴 경우를 빼기
        System.out.printf("%.5f", (double) cnt / (double) total); // 반올림 출력
        br.close();
    }
}
