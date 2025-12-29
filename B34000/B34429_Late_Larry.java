import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34429
public class B34429_Late_Larry {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String time = st.nextToken();
		String ampm = st.nextToken();
		int t = Integer.parseInt(br.readLine());
		st = new StringTokenizer(time, ":");
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		if (ampm.equals("AM")) {
			h = (h == 12) ? 0 : h;
		} else {
			h = (h == 12) ? 12 : h + 12;
		}
		int total = h * 60 + m;
		int leave = (total - t) % 1440;
		if (leave < 0) {
			leave += 1440;
		}
		int outH = leave / 60;
		int outM = leave % 60;
		String outAmpm = (outH < 12) ? "AM" : "PM";
		outH %= 12;
		if (outH == 0) {
			outH = 12;
		}
		System.out.printf("%d:%02d %s%n", outH, outM, outAmpm);
		br.close();
	}
}
