import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 넓이를 Math.sqrt() 사용해서 한 변의 길이를 구한 뒤 * 4 하기 (15610번이랑 같음)
public class B16600_Contemporary_Art {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine()); // 넓이
		System.out.printf("%.8f", Math.sqrt(a) * 4.0); // sqrt(넓이) * 4 = 둘레 출력
		br.close();
	}
}