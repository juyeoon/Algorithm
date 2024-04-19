import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 'j','o','i'로 이루어진 문자열의 총 획수를 구하는 문제
public class B31612_Stroke_Count {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력 문자열 길이
		String s = br.readLine(); // 입력 문자열
		int sum = 0; // 총 획수
		for (int i = 0; i < N; i++) { // 획수 구하기
			char c = s.charAt(i); // 현재 문자열
			if (c == 'j' || c == 'i') {
				sum += 2;
			} else if (c == 'o') {
				sum += 1;
			}
		}
		System.out.println(sum); // 획수 출력
		br.close();
	}
}