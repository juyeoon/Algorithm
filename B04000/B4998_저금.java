import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/4998
// 이자율을 구해서 반복문으로 목표치까지 얼마나 걸리는지 확인
public class B4998_저금 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = ""; 
        while((s = br.readLine()) != null) { // EOI
            StringTokenizer st = new StringTokenizer(s);
            double N = Double.parseDouble(st.nextToken()); // 초기 금액
            double B = Double.parseDouble(st.nextToken()); // 이자율 
            double M = Double.parseDouble(st.nextToken()); // 목표 금액
            double interest = 1 + (B / 100); // 계산용 이자율
            int year = 0; // 목표 연도
            while(N <= M){ // 저금 금액 계산
                year++;
                N *= interest;
            }
            sb.append(year).append("\n"); // 출력 저장
        }
        System.out.println(sb); // 출력
        br.close();
    }
}
