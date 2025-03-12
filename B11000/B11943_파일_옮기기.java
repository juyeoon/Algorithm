import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// "첫 번째 바구니의 사과 + 두 번째 바구니의 오렌지"와 "첫 번째 바구니의 오렌지 + 두 번째 바구니의 사과"를 비교하여 작은 것을 출력
public class B11943_파일_옮기기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()); // 첫 번째 바구니의 사과
		int B = Integer.parseInt(st.nextToken()); // 첫 번째 바구니의 오렌지
		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken()); // 두 번째 바구니의 사과
		int D = Integer.parseInt(st.nextToken()); // 두 번째 바구니의 오렌지
		System.out.println(B + C > A + D ? A + D : B + C); // 비교하여 최솟값 출력
		br.close();

	}
}