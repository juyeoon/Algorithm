import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// +, -를 수로 생각했을 때 => A(정수)+B(정수)-C(정수)
// 문자열로 생각했을 때 => (A(문자열)+B(문자열))(정수로 변환) - C(정수)
public class B31403_A_B_C {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		sb.append(A + B - C).append("\n"); // 수로 계산
		sb.append(Integer.parseInt(String.valueOf(A) + String.valueOf(B)) - C); // 문자열로 계산
		bw.write(sb.toString()); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}