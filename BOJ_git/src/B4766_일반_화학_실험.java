import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이전 온도와 현재 온도의 차를 출력 후 이전 온도를 현재 온도로 갱신 후 반복
public class B4766_일반_화학_실험 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		double pre = Double.parseDouble(br.readLine()); // 이전 온도
		while (!(s = br.readLine()).equals("999")) { // EOF
			double now = Double.parseDouble(s); // 현재 온도
			sb.append(String.format("%.2f", now - pre)).append("\n"); // 현재 온도 - 이전 온도 출력
			pre = now; // 이전 온도 갱신
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}
