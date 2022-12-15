import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//  달에서의 무게 = 지구에서의 무게 * 0.167
public class B4714_Lunacy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while ((s = br.readLine()).charAt(0) != '-') { // EOF
			double earth = Double.parseDouble(s); // 지구에서의 무게
			sb.append("Objects weighing ").append(String.format("%.2f", earth)); // 지구 무게 출력 문장
			sb.append(" on Earth will weigh ").append(String.format("%.2f", earth * 0.167)).append(" on the moon.\n"); // 달 무게 출력 문장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}