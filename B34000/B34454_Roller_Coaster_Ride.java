import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34454
public class B34454_Roller_Coaster_Ride {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 현재 위치(순번)
		int C = Integer.parseInt(br.readLine()); // 차량 수
		int P = Integer.parseInt(br.readLine()); // 한 차량에 탑승하는 사람 수
		System.out.println((P * C >= N) ? "yes" : "no");
		br.close();
	}
}
