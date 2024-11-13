import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/24608
// 문자열의 모든 문자의 아스키코드를 합한 후 문자열의 길이로 나눈 값을 다시 문자형으로 출력
public class B24608_Average_Character {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c[] = br.readLine().toCharArray(); // 입력 문자열
		int sum = 0; // 아스키코드의 합
		for (char i : c) { // 합 구하기
			sum += i;
		}
		System.out.println((char) (sum / c.length)); // 평균 아스키코드 값을 문자형으로 변환 후 출력
		br.close();
	}
}
