import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2. 피연산자가 10의 제곱이기 때문에 문자열 변형으로 연산 결과 구하기
// 연산자가 +이면
// 두 피연산자의 길이가 같으면 하나의 피연산자의 제일 앞의 문자를 2로 변경
// 길이가 다르면 긴 길이의 문자열의 (긴 문자열 길이 - 짧은 문자열 길이)의 위치(인덱스)의 문자를 1로 변경
// 연산자가 *이면
// 하나의 피연산자의 뒤에 다른 피연산자의 0부분만 붙인다.
public class B2935_소음_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 문자열 변형을 위한 StringBuilder
		String A = br.readLine(); // 피연산자 A
		char operator = br.readLine().charAt(0); // 연산자
		String B = br.readLine(); // 피연산자 B
		int Aleng = A.length(); // 피연산자 A의 길이
		int Bleng = B.length(); // 피연산자 B의 길이
		if (operator == '+') { // 연산자가 +이면
			if (Aleng == Bleng) { // A와 B의 길이가 같으면
				sb.append(A).setCharAt(0, '2'); // A의 제일 앞의 문자를 2로 변경
			} else if (Aleng > Bleng) { // A의 길이가 더 길면
				sb.append(A).setCharAt(Aleng - Bleng, '1'); // A의 (A길이-B길이) 위치의 문자를 1로 변경
			} else { // B의 길이가 더 길면
				sb.append(B).setCharAt(Bleng - Aleng, '1'); // B의 (B길이-A길이) 위치의 문자를 1로 변경
			}
		} else { // 연산자가 *이면
			sb.append(A).append(B.substring(1, Bleng)); // A 뒤에 B에서 1 떼고 붙임
		}
		System.out.println(sb); // 결과 출력
		br.close();
	}
}