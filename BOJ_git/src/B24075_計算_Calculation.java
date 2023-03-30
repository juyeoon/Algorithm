import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두 수의 더하기와 빼기의 크기 비교
public class B24075_計算_Calculation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int add = A + B; // 더한 값
		int subtract = A - B; // 뺀 값
		System.out.println(Math.max(add, subtract)); // 중에 큰 값 출력
		System.out.println(Math.min(add, subtract)); // 중에 작은 값 출력
		br.close();
	}
}