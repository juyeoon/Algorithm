import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 유클리드 기하학: 반지름 * 반지름 * pi
// 택시 기하학: 반지름 * 반지름 * 2
public class B3053_택시_기하학 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double R = Double.parseDouble(br.readLine()); // 반지름
		sb.append(String.format("%.6f", R * R * Math.PI)).append("\n").append(String.format("%.6f", R * R * 2));
		System.out.println(sb); // 출력
		br.close();
	}
}