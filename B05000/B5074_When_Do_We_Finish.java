import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5074_When_Do_We_Finish {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("00:00 00:00")) {
			StringTokenizer st = new StringTokenizer(s);
			String start = st.nextToken();
			String duration = st.nextToken();

			int startMin = toMinutes(start);
			int durMin = toMinutes(duration);
			int total = startMin + durMin;
			int days = total / (24 * 60);
			int endMin = total % (24 * 60);
			sb.append(formatTime(endMin));
			if (days > 0) {
				sb.append(" +").append(days);
			}
			sb.append("\n");
		}

		System.out.print(sb);
	}

	private static int toMinutes(String hhmm) {
		int h = Integer.parseInt(hhmm.substring(0, 2));
		int m = Integer.parseInt(hhmm.substring(3, 5));
		return h * 60 + m;
	}

	private static String formatTime(int minutes) {
		int h = minutes / 60;
		int m = minutes % 60;
		return String.format("%02d:%02d", h, m);
	}
}