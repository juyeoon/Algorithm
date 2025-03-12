import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11721_열_개씩_끊어_출력하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 문자열
		// 10의 배수만큼만 sb에 추가 (나머지 만큼은 제외)
		for (int i = 0; i < s.length() / 10; i++) { // 문자열 길이의 10의 자리 수 
			for (int j = 0; j < 10; j++) { // 문자열 길이의 1의 자리 수
				sb.append(s.charAt(i * 10 + j));
			}
			sb.append("\n");
		}
		int temp1 = s.length() / 10; // sb에 저장한 길이
		int temp2 = s.length() % 10; // 저장하지 않은 나머지 문자
		// 나머지 만큼 추가
		for (int i = 0; i < temp2; i++) {
			sb.append(s.charAt(temp1 * 10 + i));
		}
		System.out.println(sb); // 출력
	}
}
