import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/27951
// 상의와 하의 옷걸이를 다 못 쓰면 다 걸 수 없음
// 다 걸 수 있을 때 공용에 걸어야 하는 상의 개수를 구한 후 공용 옷걸이에는 상의 먼저 다 걸고 남은 옷걸이에 하의를 검(스페셜 저지)
public class B27951_옷걸이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine()); // 옷(옷걸이) 개수
        int cnt[] = new int[4]; // 각 유형의 옷걸이 개수
        int hanger[] = new int[N]; // 옷걸이 분포
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) { // 옷걸이 분포 저장 및 개수 세기
            hanger[i] = Integer.parseInt(st.nextToken());
            cnt[hanger[i]]++;
        }
        st = new StringTokenizer(br.readLine());
        int U = Integer.parseInt(st.nextToken()); // 상의 옷 개수
        int D = Integer.parseInt(st.nextToken()); // 하의 옷 개수
        int UR = U - cnt[1]; // 공용에 걸어야 하는 옷 개수
        if (cnt[1] - U > 0 || cnt[2] - D > 0) { // 상의 옷걸이와 하의 옷걸이를 다 못 쓸 때
            sb.append("NO");
        } else { // 모두 걸 수 있을 때
            sb.append("YES\n");
            for (int i = 0; i < N; i++) {
                if (hanger[i] == 1) { // 상의
                    sb.append("U");
                } else if (hanger[i] == 2) { // 하의
                    sb.append("D");
                } else { // 공용 => 상의부터 걸기
                    if (UR > 0) { // 상의가 남아있으면 상의 걸기
                        sb.append("U");
                        UR--;
                    } else{
                        sb.append("D");
                    }
                }
            }
        }
        System.out.println(sb); // 출력
        br.close();
    }
}
