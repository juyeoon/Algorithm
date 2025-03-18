import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

// https://www.acmicpc.net/problem/31796
// sol1에서는 dp로 생각했는데 다시 생각해보니 모든 값에 대해서 최솟값을 구하지 않고
// 2배 이상이 되는 부분에서부터 최솟값을 구하면 됨 ⇒ 그리디 문제
// 시간: 304 ms
public class B31796_한빛미디어_Easy_sol2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 가격 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int price[] = new int[N]; // 가격
        for (int i = 0; i < N; i++) { // price[] 채우기
            price[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(price); // 가격 오름차순 정렬
        int cnt = 0; // 그룹(페이지) 수
        int idx = 0; // 확인할 위치(인덱스)
        while(idx < N){ // 배열 범위
            int doublePrice = price[idx] * 2; // 현재 가격의 두 배 가격
            while(idx < N && price[idx] < doublePrice) { // 배열 범위 안이면서 두 배 이내면 위치만 옮김
                idx++;
            }
            cnt++; // 배열을 넘거나 두 배 가격을 넘으면 카운트
        }
        System.out.println(cnt); // 출력
        br.close();
    }
}
