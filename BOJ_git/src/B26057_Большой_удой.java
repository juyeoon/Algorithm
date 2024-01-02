import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (두 참가자가 짜낸 우유의 양) = 2 * (우유를 짜는데에 걸린 시간) - (두 참가자가 얻은 우유의 양)
public class B26057_Большой_удой {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine()); // 두 참가자가 얻은 우유의 양
		int t = Integer.parseInt(br.readLine()); // 우유를 짜는데에 걸린 시간
		System.out.println(2 * t - l); // 두 참가자가 짜낸 우유의 양
		br.close();
	}
}