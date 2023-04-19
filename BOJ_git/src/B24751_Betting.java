import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 옵션 1 전환 비율 = 100 / (옵션 1에 베팅한 포인트의 백분율)
// 옵션 2 전환 비율 = 100 / (옵션 2에 베팅한 포인트의 백분율 = 100 - 옵션 1에 배팅한 포인트 백분율)
public class B24751_Betting {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine()); // 옵션 1에 베팅한 스위치 포인트의 백분율
		System.out.println(String.format("%.10f", 100 / a)); // 옵션 1에 대한 전환 비율
		System.out.println(String.format("%.10f", 100 / (100 - a))); // 옵션 2에 대한 전환 비율
		br.close();
	}
}