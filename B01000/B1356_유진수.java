import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1356
// 문자열을 가능한 모든 연속된 두 부분으로 나누어 앞부분과 뒷부분의 곱을 구하고 두 부분이 동일한지 확인
public class B1356_유진수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine(); // 주어진 수
		int leng = N.length(); // 나누기 위한 길이
		boolean yes = false; // 유진수 여부 (true: 유진수
		for (int i = 1; i < leng; i++) { // 모든 분할 방법을 시도
			String left = N.substring(0, i); //
			String right = N.substring(i); // 오른쪽
			int leftNum = 1; // 왼쪽 곱 구하기
			for (char c : left.toCharArray()) {
				leftNum *= c - '0';
			}
			int rightNum = 1; // 오른쪽 곱 구하기
			for (char c : right.toCharArray()) {
				rightNum *= c - '0';
			}
			if (leftNum == rightNum) { // 곱이 같으면 유진수로 판단
				yes = true;
				break;
			}
		}
		System.out.println(yes ? "YES" : "NO"); // 출력
		br.close();
	}
}
