import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 우편 종류 1개당 중량을 배열에 저장한 후(size 배열) 개수를 입력 받아 곱한 값을 더하여 출력
public class B24183_Affischutskicket {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		double[] size = { 0.229 * 0.324 * 2, 0.297 * 0.420 * 2, 0.210 * 0.297 }; // 중량(C4 2장, A3 2장, A4 1장)
		double sum = 0.0; // 무게 합계
		for (int i = 0; i < 3; i++) {
			sum += size[i] * Integer.parseInt(s[i]); // 개수 * 중량
		}
		System.out.printf("%.6f", sum); // 무계 출력

	}
}