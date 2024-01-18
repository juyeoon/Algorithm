import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 총 불꽃의 수 N은 1(대형) + K(중형) + K*K(소형) = K(K+1)+1
// 따라서 K는 (int) Math.sqrt(N - 1)
public class B15667_2018_연세대학교_프로그래밍_경진대회 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 총 불꽃의 수
		System.out.println((int) Math.sqrt(N - 1)); // 출력
		br.close();
	}
}