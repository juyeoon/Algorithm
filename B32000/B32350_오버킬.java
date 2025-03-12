import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32350
// 각 몬스터를 순회하면서 해당 몬스터에 필요한 턴 수를 계산하고 오버킬 발생 여부 확인
// 오버킬 발생 시 다음 몬스터에 들어갈 대미지를 계산 후 다음 몬스터가 있으면 대미지 적용
public class B32350_오버킬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 몬스터의 수
        int D = Integer.parseInt(st.nextToken()); // 기본 대미지
        int p = Integer.parseInt(st.nextToken()); // 오버킬 비율
        st = new StringTokenizer(br.readLine());
        int[] Ai = new int[N]; // 각 몬스터의 체력
        for (int i = 0; i < N; i++) { // Ai[] 채우기
            Ai[i] = Integer.parseInt(st.nextToken());
        }
        int turn = 0; // 모든 몬스터를 죽이기 위해 필요한 턴 수
        for (int i = 0; i < N; i++) { 
            if (Ai[i] <= 0) {
                continue; // 이미 죽은 몬스터는 건너뛰기
            }
            turn += Ai[i] / D; // 해당 몬스터에 필요한 턴 수 누적
            int h = Ai[i] % D; // 해당 몬스터를 죽이기까지 남은 hp
            if (h > 0) { // hp가 남아있으면 오버킬
                turn++; // 턴 추가
                int r = (int)((D - h) * p / 100.0); // 다음 몬스터에 적용될 오버킬 대미지지
                if (i + 1 < N) {
                    Ai[i + 1] -= r; // 다음 몬스터에게 오버킬 대미지 적용
                }
            }
        }
        System.out.print(turn); // 출력
        br.close();
    }
}
