import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 과녁의 점수가 2의 제곱수이고 C가 둘 중 한 명만 맞힌 표적만 맞힌 것만 맞혔으므로 이진수 XOR로 값을 구함
public class B27960_사격_내기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		System.out.println(A ^ B); // XOR 출력
		br.close();
	}
}