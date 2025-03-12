import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 조건에 맞게 출력하는 문제
public class B21638_SMS_from_MCHS {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t1 = Integer.parseInt(st.nextToken()); // 오늘의 기온
		int v1 = Integer.parseInt(st.nextToken()); // 오늘의 풍속
		st = new StringTokenizer(br.readLine());
		int t2 = Integer.parseInt(st.nextToken()); // 내일의 기온
		int v2 = Integer.parseInt(st.nextToken()); // 내일의 풍속
		if (t2 < 0 && v2 >= 10) { // 내일 기온이 영하고 풍속이 10이 넘을 때
			System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
		} else if (t2 < t1) { // 오늘보다 내일이 추울 때
			System.out.println("MCHS warns! Low temperature is expected tomorrow.");
		} else if (v2 > v1) { // 오늘보다 내일 풍속이 빠를 때
			System.out.println("MCHS warns! Strong wind is expected tomorrow.");
		} else { // 그 외의 경우
			System.out.println("No message");
		}
		br.close();
	}
}