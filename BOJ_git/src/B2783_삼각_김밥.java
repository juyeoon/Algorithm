import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1g 당 가격을 구한 후 최저값을 구함
public class B2783_삼각_김밥 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// 세븐 25의 가격
		st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken()); // X원
		double Y = Double.parseDouble(st.nextToken()); // Y그램
		double min = X / Y * 1000; // 1000g의 가격을 최솟값으로 설정
		// 다른 편의점의 가격
		int N = Integer.parseInt(br.readLine()); // 편의점 개수
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			X = Integer.parseInt(st.nextToken()); // X원
			Y = Double.parseDouble(st.nextToken()); // Y그램
			min = Math.min(min, X / Y * 1000); // 1000g의 가격 중 최솟값으로 설정
		}
		System.out.println(String.format("%.2f", min)); // 소수 둘째자리까지 반올림
		br.close();
	}
}