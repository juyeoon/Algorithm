import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연도가 주어졌을 때 그 해의 우승자 출력 (단순 구현)
public class B20232_Archivist {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 연도
		// 경우에 따라 출력
		if (N == 2006) {
			System.out.println("PetrSU, ITMO");
		} else if (N == 1996 || N == 1997 || N == 2000 || N == 2007 || N == 2008 || N == 2013 || N == 2018) {
			System.out.println("SPbSU");
		} else {
			System.out.println("ITMO");
		}
		br.close();
	}
}