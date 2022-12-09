import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 안테나와 눈의 개수에 맞춰 출력
public class B6778_Which_Alien물음표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int antenna = Integer.parseInt(br.readLine());
		int eyes = Integer.parseInt(br.readLine());

		if (antenna >= 3 && eyes <= 4) { // 안테나가 최소 3개, 눈이 최대 4개
			sb.append("TroyMartian\n");
		}
		if (antenna <= 6 && eyes >= 2) { // 안테나가 최대 6개, 눈이 최소 2개
			sb.append("VladSaturnian\n");
		}
		if (antenna <= 2 && eyes <= 3) { // 안테나 최대 2개, 눈이 최대 3개
			sb.append("GraemeMercurian\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}