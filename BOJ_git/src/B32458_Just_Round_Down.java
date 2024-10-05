import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// double 형으로 입력 받아 Math.floor로 소숫점 버림
public class B32458_Just_Round_Down {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double x = Double.parseDouble(br.readLine()); // 입력받은 부동소수점
		System.out.println((int) (Math.floor(x))); // 버림으로 출력
		br.close();
	}
}
