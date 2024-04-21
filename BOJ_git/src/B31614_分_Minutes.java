import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// H시간 M분이 주어지고 단위를 분으로 바꾸면 몇 분인지 구하는 문제
// = H * 60 + M(분)
public class B31614_分_Minutes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int H = Integer.parseInt(br.readLine()); // 시
		int M = Integer.parseInt(br.readLine()); // 분
		System.out.println(H * 60 + M); // 출력
		br.close();
	}
}