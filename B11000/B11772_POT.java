import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11772
// 맨 뒤의 숫자를 지수로 바꾼 값의 합을 구하는 문제
// String으로 수를 입력 받은 후 뒤의 밑수와 지수를 구한 후 실제 제곱값을 구하여 더하기 
// 999^9까지 가능하기 때문에 long 사용
public class B11772_POT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim()); // 입력 줄 수 
        long sum = 0;  // 원래대로 계산했을 때의 값
        for (int i = 0; i < N; i++) {
            String line = br.readLine().trim(); // 입력 수
            int length = line.length(); // 지수와 밑수를 구분하기 위한 길이
            int base = Integer.parseInt(line.substring(0, length - 1));  // 앞 부분이 밑수
            int exponent = line.charAt(length - 1) - '0'; // 마지막 자리가 지수
            long result = (long) Math.pow(base, exponent);  // 제곱수 구하기
            sum += result; // 합 구하기
        }
        System.out.println(sum); // 출력
        br.close();
    }
}
