import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31009
// 입력을 각각 변수에 받은 후 진주의 요금을 구하고 요금을 저장한 배열을 돌면서 진주의 요금보다 비싼 개수를 구함
public class B31009_진주로_가자_Easy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 교통편 수
        String[] D = new String[N]; // 교통편의 정보
        int[] C = new int[N]; // 교통편의 도착지
        int jinju = 0; // 진주로 가는 교통편의 요금
        for (int i = 0; i < N; i++) { // D[], C[], jinju 채우기
            StringTokenizer st = new StringTokenizer(br.readLine());
            D[i] = st.nextToken();
            C[i] = Integer.parseInt(st.nextToken());
            if (D[i].equals("jinju")) {
                jinju = C[i];
            }
        }
        int cnt = 0; // 진주로 가는 교통편보다 비싼 교통편의 개수
        for (int i = 0; i < N; i++) { // 개수 구하기
            if (C[i] > jinju) {
                cnt++;
            }
        }
        System.out.println(jinju); // 출력
        System.out.println(cnt);
    }
}
