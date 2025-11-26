import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34691
public class B34691_대전과학고등학교를_사랑하십니까 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("end")) {
			if (s.equals("animal")) {
				sb.append("Panthera tigris");
			} else if (s.equals("flower")) {
				sb.append("Forsythia koreana");
			} else {
				sb.append("Pinus densiflora");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
