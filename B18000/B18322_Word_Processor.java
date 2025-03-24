import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/18322
// 단어를 공백 제외하고 K문자만큼만 한 줄에 넣어서 출력하는 문제
// 카운트 변수를 사용해서 현재 단어의 길이만큼 더했을 때 K가 넘으면 개행하여 다음 줄에 단어 추가
// 주의: 모든 행의 끝에는 공백이 없어야 하므로 개행 전에 sb.setLength(sb.length() - 1)로 마지막 공백 없애주기
public class B18322_Word_Processor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 단어의 수
        int K = Integer.parseInt(st.nextToken()); // 길이 제한
        st = new StringTokenizer(br.readLine());
        int cnt = 0; // 현재 줄의 길이
        for (int i = 0; i < N; i++) {
            String tmp = st.nextToken(); // 현재 단어
            if (cnt + tmp.length() > K) { // 제한을 넘으면
                sb.setLength(sb.length() - 1); // 마지막 공백 제외하고 
                sb.append("\n"); // 개행
                cnt = 0; // 카운트 리셋
            }
            cnt += tmp.length(); // 길이 카운트
            sb.append(tmp).append(" "); // 단어 출력 저장
        }
        sb.setLength(sb.length() - 1); // 마지막 줄 공백 빼기
        System.out.println(sb); // 출력
        br.close();
    }
}
