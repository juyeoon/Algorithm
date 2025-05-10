import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31052
// 회사 위치를 배열에 저장한 후 입력 번호에 따라서 처리
// 타입 1 요청(1 C X): 회사 C의 위치를 X로 업데이트 => P[C] = X
// 타입 2 요청(2 A B): 회사 A와 B의 현재 위치 차이의 절댓값을 출력 => Math.abs(P[A] - P[B])
public class B31052_Relocation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 앱이 추적하는 회사 수
        int Q = Integer.parseInt(st.nextToken()); // 처리할 요청의 수
        int P[] = new int[N + 1]; // 회사들의 위치
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {  // P[] 채우기
            P[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < Q; i++) { 
            st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            if(K == 1) { // 회사 위치 갱신
                int C = Integer.parseInt(st.nextToken());
                int X = Integer.parseInt(st.nextToken());
                P[C] = X;
            } else { // 거리 계산 요청
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                int distance = Math.abs(P[A] - P[B]);
                sb.append(distance).append("\n");
            }
        }
        System.out.println(sb); // 출력
        br.close();
    }
}