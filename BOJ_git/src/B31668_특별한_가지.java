import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 필요한 가지의 최솟값 = 파묻튀밥 줄 개수 * 한 줄에 필요한 가지 양(K)
// = (학교가 파묻튀를 사용한 양(M) / 한 줄에 들어가는 파묻튀의 양(N))(소수점 버림) * 한 줄에 필요한 가지 양(K)
public class B31668_특별한_가지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 파묻튀밥 한 줄에 들어가는 파묻튀의 양
		int M = Integer.parseInt(br.readLine()); // 학교가 파묻튀를 사용한 양
		int K = Integer.parseInt(br.readLine()); // 파묻튀밥 한 줄에 필요한 가지의 양
		System.out.println(M / N * K); // 출력
		br.close();
	}
}