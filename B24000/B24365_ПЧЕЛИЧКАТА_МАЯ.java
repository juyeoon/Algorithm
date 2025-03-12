import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 꿀벌이 세 송이에 A <= B <= C처럼 있을 때, 세 송이의 벌의 수를 같게 만들려면 날아야 하는 최소 거리의 합을 구하는 문제
// C에서 평균값의 차만큼 B로 이동시킨 후 B에서 평균값의 차만큼 A로 이동시킨 후 그 값들의 합을 출력
public class B24365_ПЧЕЛИЧКАТА_МАЯ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int avg = (A + B + C) / 3; // 세 값의 평균
		int ans = C - avg; // C에서 B로 이동할 벌의 수
		B += C - avg; // C에서 B로 이동한 벌의 수
		ans += B - avg; // B에서 C로 이동할 벌의 수
		System.out.println(ans); // 출력
		br.close();
	}
}