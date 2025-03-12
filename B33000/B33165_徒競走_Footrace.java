import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33165
// 거리 = 속력 * 시간
public class B33165_徒競走_Footrace {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 속력
		int V = Integer.parseInt(br.readLine()); // 거리
		System.out.println(T * V); // 출력
		br.close();
	}
}
