import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/6030
// P와 Q의 약수를 찾고, 각 수의 조합을 모두 출력하는 문제
// 각각의 수에 대해서 반복문으로 약수를 찾고 ArrayList에 저장하여 조합을 출력 
public class B6030_Scavenger_Hunt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int P = Integer.parseInt(st.nextToken()); // 정수 P
        int Q = Integer.parseInt(st.nextToken()); // 정수 Q
        ArrayList<Integer> arrP = new ArrayList<>(); // P의 약수
        for (int i = 1; i <= P; i++) { // 약수 구하기
            if (P % i == 0) {
                arrP.add(i);
            }
        }
        ArrayList<Integer> arrQ = new ArrayList<>(); // Q의 약수
        for (int i = 1; i <= Q; i++) { // 약수 구하기
            if (Q % i == 0) {
                arrQ.add(i);
            }
        }
        // 조합 출력 저장
        for (Integer p : arrP) {
            for (Integer q : arrQ) {
                sb.append(p).append(" ").append(q).append("\n");
            }
        }
        System.out.println(sb); // 출력
        br.close();
    }
}
