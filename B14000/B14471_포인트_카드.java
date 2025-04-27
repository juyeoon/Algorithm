import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14471
// 모든 카드 중 M-1장 이상 경품으로 만들기 위해 필요한 최소 비용 계산
// 비용이 적은 카드부터 골라서 최소 비용을 구함
public class B14471_포인트_카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 한 카드의 칸 수 절반
        int M = Integer.parseInt(st.nextToken()); // 포인트 카드의 총 개수
        List<Integer> cost = new ArrayList<>(); // 각 카드별 필요한 비용
        for (int i = 0; i < M; i++) { // M장의 카드에 대해 반복
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); // 당첨 도장 개수
            int B = Integer.parseInt(st.nextToken()); // 꽝 도장 개수
            // 당첨 도장이 이미 N개 이상이면 0 비용, 아니면 필요한 교체 횟수 추가
            if (A >= N) {
                cost.add(0);
            } else {
                cost.add(N - A);
            }
        }
        Collections.sort(cost); // 비용이 적은 카드부터 정렬
        int answer = 0; // 최소 비용
        for (int i = 0; i < M - 1; i++) { // 최소 비용 구하기
            answer += cost.get(i);
        }
        System.out.println(answer); // 출력
    }
}
