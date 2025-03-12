import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 버스가 이동하는 데에 걸리는 시간(x)이 버스 도착시간(y)보다 크면 (x + y) 아니면 (y - x)
public class B25625_샤틀버스 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int x = Integer.parseInt(s[0]); // 버스가 이동하는 데에 걸리는 시간
		int y = Integer.parseInt(s[1]); // 버스 도착시간
		System.out.println((x > y) ? (x + y) : (y - x)); // 출력
		br.close();
	}
}