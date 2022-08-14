import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력이 0이면 "YONSEI", 1이면 "Leading the Way to the Future" 출력
public class B15680_연세대학교 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 입력
        System.out.println(N == 0 ? "YONSEI" : "Leading the Way to the Future"); // 출력
        br.close();
    }
}
