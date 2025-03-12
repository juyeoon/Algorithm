import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 미리 하트 모양의 문자열을 저장한 후, 입력 받은 수만큼 반복하여 저장 후 출력
public class B26766_Serca {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String heart = " @@@   @@@ \n@   @ @   @\n@    @    @\n@         @\n @       @ \n  @     @  \n   @   @   \n    @ @    \n     @     \n"; // 하트 문자열
		int N = Integer.parseInt(br.readLine()); // 반복 횟수
		for (int i = 0; i < N; i++) {
			sb.append(heart);
		}
		System.out.println(sb); // 출력
		br.close();
	}
}