import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 참가자가 먹은 핫도그의 총 개수(H)와 참가자의 총 수(P)가 주어질 때, 참가자가 먹은 핫도그 수의 평균을 출력하는 문제
// 평균 = H/P(소수 두 자리까지)
public class B5666_Hot_Dogs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while ((s = br.readLine()) != null) { // EOI
			st = new StringTokenizer(s);
			double H = Double.parseDouble(st.nextToken()); // 핫도그 총 개수
			double P = Double.parseDouble(st.nextToken()); // 참가자의 총 수
			sb.append(String.format("%.2f\n", H / P)); // 평균을 소수 두자리까지 출력에 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
