import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31831
// 오늘의 스트레스의 양을 저장한 후 스트레스 변화량에 따라 스트레스 양을 갱신한 후 복통 여부 확인
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 스트레스 변화를 관찰한 일수
        int M = Integer.parseInt(st.nextToken()); // 복통을 겪게 되는 스트레스의 양
        int cnt = 0; // 복통을 겪게 되는 일수
        int stress = 0; // 오늘의 스트레스
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken()); // 스트레스 변화량
            stress += A;
            if(stress < 0) { // 음수 처리
                stress = 0;
            }
            if(stress >= M) { // 오늘의 복통 여부
                cnt++;
            }
        }
        System.out.println(cnt); // 출력
        br.close();
    }
}