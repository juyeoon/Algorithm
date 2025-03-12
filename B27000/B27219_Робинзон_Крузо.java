import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// n을 5개씩 묶은 값(n/5)만큼 V 출력. 나머지 만큼 I 출력
public class B27219_Робинзон_Крузо {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // n
		for (int i = 0; i < n / 5; i++) { // V 출력
			sb.append('V');
		}
		for (int i = 0; i < n % 5; i++) { // I 출력
			sb.append('I');
		}
		System.out.println(sb); // 출력
		br.close();
	}
}