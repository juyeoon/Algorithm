import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// https://www.acmicpc.net/problem/23627
// String의 endsWith 함수로 문자열의 마지막이 "driip"인지 확인
public class B23627_driip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine(); // 입력 문자열
        System.out.println(S.endsWith("driip")?"cute":"not cute"); // 출력
        br.close();
    }
}
