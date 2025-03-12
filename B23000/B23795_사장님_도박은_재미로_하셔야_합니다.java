import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// -1 입력 전까지의 수의 합 출력
public class B23795_사장님_도박은_재미로_하셔야_합니다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0; // 합계
		String s = ""; // 입력
		while (!(s = br.readLine()).equals("-1")) { // -1이 입력되기 전까지 반복
			sum += Integer.parseInt(s);
		}
		System.out.println(sum); // 출력
		br.close();
	}
}
