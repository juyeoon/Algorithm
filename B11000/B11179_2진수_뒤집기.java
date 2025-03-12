import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// String으로 입력받은 수를 int로 변경 -> 이진수(String)로 변환 -> 이진수 뒤집기 -> 십진수(int)로 변환
public class B11179_2진수_뒤집기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력받은 수
		String binary = Integer.toBinaryString(N); // 입력받은 수 -> 이진수
		int leng = binary.length();
		StringBuilder sb = new StringBuilder(); // 이진수 뒤집기
		for (int i = leng - 1; i >= 0; i--) { // 뒤집기 실행
			sb.append(binary.charAt(i));
		}
		System.out.println(Integer.parseInt(sb.toString(), 2)); // 이진수 -> 십진수(int)
		br.close();
	}
}
