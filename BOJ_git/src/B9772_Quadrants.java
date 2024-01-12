import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// if-else문으로 입력값에 따라 조건을 분기하여 출력
public class B9772_Quadrants {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) { // EOI
			String inp[] = s.split(" ");
			double x = Double.parseDouble(inp[0]); // x좌표
			double y = Double.parseDouble(inp[1]); // y좌표
			if (x == 0 || y == 0) { // 축(0포함)
				sb.append("AXIS\n");
			} else if (x > 0 && y > 0) { // 제1사분면(+,+)
				sb.append("Q1\n");
			} else if (x < 0 && y > 0) { // 제2사분면(-,+)
				sb.append("Q2\n");
			} else if (x < 0 && y < 0) { // 제3사분면(-,-)
				sb.append("Q3\n");
			} else { // 제4사분면(+,-)
				sb.append("Q4\n");
			}
		}
		sb.append("AXIS"); // 마지막 줄 (0,0)
		System.out.println(sb); // 출력
		br.close();
	}
}