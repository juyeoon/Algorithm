import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/13670
// 현재 시각과 알람 시각이 주어졌을 때, Daniela가 잘 수 있는 총 시간을 분 단위로 계산
public class B13670_Alarme_Despertador {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0 0 0")) { // EOI
			StringTokenizer st = new StringTokenizer(s);
			int H1 = Integer.parseInt(st.nextToken());
			int M1 = Integer.parseInt(st.nextToken());
			int H2 = Integer.parseInt(st.nextToken());
			int M2 = Integer.parseInt(st.nextToken());
			// 현재 시각과 알람 시각을 모두 분 단위로 환산
			int current = H1 * 60 + M1;
			int alarm = H2 * 60 + M2;
			// 알람 시간이 현재보다 작거나 같으면, 다음 날로 넘어감
			if (alarm <= current) {
				alarm += 24 * 60;
			}
			// Daniela가 잘 수 있는 시간
			sb.append(alarm - current).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
