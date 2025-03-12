import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두 기차가 만날 때까지 파리의 이동거리 = (기차가 만나지 않는 시간) * 파리의 속도
// = (처음 두 기차 사이의 거리 / (기차의 속도 * 2)) * 파리의 속도
public class B14924_폰_노이만과_파리 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int S = Integer.parseInt(s[0]); // 기차의 속도
		int T = Integer.parseInt(s[1]); // 파리의 속도
		int D = Integer.parseInt(s[2]); // 처음 두 기차 사이의 거리
		System.out.println(D / (S * 2) * T); // 출력
		br.close();
	}
}
