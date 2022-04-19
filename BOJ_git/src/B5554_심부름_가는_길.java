import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5554_심부름_가는_길 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0; // 총 이동 시간(초)
		for (int i = 0; i < 4; i++) {
			sum += Integer.parseInt(br.readLine());
		} // input
		System.out.println(sum / 60); // 총 이동 시간(분)
		System.out.println(sum % 60); // 총 이동 시간(초)
		br.close();
	}
}
