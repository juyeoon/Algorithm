import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34412
// 13이상부터는 숫자를 하나 밀어서 출력
public class B34412_13_Floors {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		if (x < 13) { // 13 미만
			System.out.println(x);
		} else { // 13 이상
			System.out.println(x + 1);
		}
		br.close();
	}
}
