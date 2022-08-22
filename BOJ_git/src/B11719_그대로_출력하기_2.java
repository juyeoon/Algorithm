import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// enter 칠 때마다 while 안이 불러지고 끝이 안 나기 때문에 while 안에서 출력해야 한다.
public class B11719_그대로_출력하기_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = ""; // 입력 받은 문장 한 줄
		while (((s = br.readLine()) != null)) {
			System.out.println(s); // 출력
		}
		br.close();
	}
}
