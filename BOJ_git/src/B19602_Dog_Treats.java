import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 수식으로 계산 후 10이상인지 아닌지 확인
public class B19602_Dog_Treats {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = Integer.parseInt(br.readLine()) + 2 * Integer.parseInt(br.readLine())
				+ 3 * Integer.parseInt(br.readLine()); // 간식 양 계산
		System.out.println(value >= 10 ? "happy" : "sad"); // 출력
		br.close();
	}
}