import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 노래 길이 n을 4박자로 나눈 값 (n/4) 출력
public class B27389_Metronome {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double n = Double.parseDouble(br.readLine()); // 노래 길이
		System.out.println(n / 4); // 메트로놈 회전수 출력
		br.close();
	}
}