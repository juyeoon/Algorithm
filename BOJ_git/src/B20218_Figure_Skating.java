import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// https://www.acmicpc.net/problem/20218
// 각 선수의 이름과 예측 순위를 key-value 형식으로 저장하고
// 최종 순위를 입력 받아 예측 순위와 같은 선수는 따로 카운트
// 순위 변동 최댓값보다 더 크게 순위가 오른 선수를 기록
// 모든 선수가 순위 변동이 없었으면 suspicious 출력
// 그 외에는 최댓값을 가지는 선수 이름을 출력
public class B20218_Figure_Skating {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 참가자의 수
        Map<String, Integer> prediction = new HashMap<>(); // 참가자의 예측 순위
        for (int i = 1; i <= n; i++) { // prediction 채우기
            prediction.put(br.readLine(), i);
        }
        String favorite = ""; // 심사위원이 가장 좋아하는 선수 이름
        int max = 0; // 가장 큰 순위의 차
        int equalCnt = 0; // 예측과 같은 순위를 가진 참가자의 수
        for (int i = 1; i <= n; i++) {
            String name = br.readLine(); // 참가자 이름
            int p = prediction.get(name); // 예측 순위
            if(i == p){ // 예측 순위와 최종 순위가 같음
                equalCnt++;
            }else if(p - i > 0 && max < p - i){ // 지금까지의 최댓값보다 더 많은 순위가 올랐을 때
                max = p - i;
                favorite = name;
            }
        }
        if(equalCnt == n) { // 모두의 예측 순위와 최종 순위가 같을 때
            System.out.println("suspicious");
        } else { // 그 외
            System.out.println(favorite); // 가장 좋아하는 선수 출력
        }
        br.close();
    }
}
