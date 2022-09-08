import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가로 개수 = R / N , 나머지가 있으면  + 1
// 세로 개수  = C / N , 나머지가 있으면 + 1
// 최소 개수 = 가로 개수 * 세로 개수
public class B13136_Do_Not_Touch_Anything {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		double R = Double.parseDouble(s[0]); // 전체 가로 길이
		double C = Double.parseDouble(s[1]); // 전체 세로 길이
		int N = Integer.parseInt(s[2]); // CCTV가 촬영할 수 있는 가로, 세로
		System.out.println((long) Math.ceil(R / N) * (long) Math.ceil(C / N)); // 가로 개수 * 세로 개수
		br.close();
	}
}
