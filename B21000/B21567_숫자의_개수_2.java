import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// https://www.acmicpc.net/problem/21567
// 숫자의 범위가 크기 때문에 BigInteger 사용
// 세 수를 곱한 후 String으로 타입 변환 후 각각의 자리수를 순환
// 각 숫자의 개수를 저장하는 배열에 숫자 등장 횟수를 저장 후 배열 내용 출력 
public class B21567_숫자의_개수_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger A = new BigInteger(br.readLine()); // 자연수 A
		BigInteger B = new BigInteger(br.readLine()); // 자연수 B
		BigInteger C = new BigInteger(br.readLine()); // 자연수 C
		BigInteger num = A.multiply(B).multiply(C); // 세 수를 곱한 값
		String ans = num.toString(); // String으로 변환한 값
		int cnt[] = new int[10]; // 각 숫자의 등장 횟수
		for (int i = 0; i < ans.length(); i++) { // 등장 횟수 구하기
			cnt[ans.charAt(i) - '0']++;
		}
		for (int i : cnt) { // 출력 저장
			sb.append(i).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
