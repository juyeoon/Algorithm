import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A와 B를 더해서 12로 나눈 나머지 출력
// 나머지가 0일때 12 출력
public class B24083_短針_Hour_Hand {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine()); // A시
		int B = Integer.parseInt(br.readLine()); // B 시간 후
		int ans = (A + B) % 12; // A와 B를 더해서 12로 나눈 나머지
		System.out.println(ans == 0 ? 12 : ans); // 나머지가 0일때 12 출력(에외 처리)
		br.close();
	}
}