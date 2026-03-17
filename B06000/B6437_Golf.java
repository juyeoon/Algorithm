import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 6437 - Golf 
// https://www.acmicpc.net/problem/6437
public class B6437_Golf {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tcs = "";
		int hole = 1;
		while (!(tcs = br.readLine()).equals("0 0")) {
			StringTokenizer st = new StringTokenizer(tcs);
			int p = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			sb.append("Hole #").append(hole).append("\n");
			String result = "";
			if (s == 1) {
				result = "Hole-in-one.";
			} else {
				int diff = s - p;
				if (diff <= -3)
					result = "Double eagle.";
				else if (diff == -2)
					result = "Eagle.";
				else if (diff == -1)
					result = "Birdie.";
				else if (diff == 0)
					result = "Par.";
				else if (diff == 1)
					result = "Bogey.";
				else
					result = "Double Bogey.";
			}
			sb.append(result).append("\n\n");
			hole++;
		}
		System.out.println(sb);
		br.close();
	}
}
