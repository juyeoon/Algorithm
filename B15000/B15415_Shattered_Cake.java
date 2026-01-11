import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15415
public class B15415_Shattered_Cake {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long W = Long.parseLong(br.readLine());
		long N = Long.parseLong(br.readLine());
		long area = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long wi = Long.parseLong(st.nextToken());
			long li = Long.parseLong(st.nextToken());
			area += wi * li;
		}
		System.out.println(area / W);
		br.close();
	}
}
