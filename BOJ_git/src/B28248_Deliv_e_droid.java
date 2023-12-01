import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (배달된 패키지 수 * 50) - (장애물에 충돌한 횟수 * 10) 
// + 배달된 패키지 수 > 장애물에 충돌한 횟수이면 500 아니면 0
public class B28248_Deliv_e_droid {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine().trim()); // 배달된 패키지 수
		int C = Integer.parseInt(br.readLine().trim()); // 장애물에 충돌한 횟수
		System.out.println(P * 50 - C * 10 + (P > C ? 500 : 0)); // 출력
		br.close();
	}
}