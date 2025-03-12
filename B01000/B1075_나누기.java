import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 바꿀 뒤의 두 자리 수가 최소이기 위해서는 뒤의 두 자리가 "00"일 때부터 생각
// N의 뒤의 두 자리가 00인 수를 NN이라고 하면 
// NN을 F로 나눈 나머지를 NN에 더하면 뒤의 두 자리 수가 최소이면서 F로 나누어 떨어지는 수를 찾을 수 있음
public class B1075_나누기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder N = new StringBuilder(br.readLine()); // N
		N.setCharAt(N.length() - 1, '0'); // N의 맨 뒷자리를 0으로
		N.setCharAt(N.length() - 2, '0'); // N의 뒤에서 두번째 자리를 0으로
		int NN = Integer.parseInt(N.toString()); // N의 뒤의 두자리가 0인 수
		int F = Integer.parseInt(br.readLine()); // F
		int r = NN % F; // NN을 F로 나눈 나머지
		int ans = (r == 0) ? 0 : (F - r); // 나머지가 0이면 00이 최소, 그 외에는 F에서 나머지를 뺀 수가 최소
		System.out.println(String.format("%02d", ans)); // 자리수 맞춰서 출력
		br.readLine();
	}
}