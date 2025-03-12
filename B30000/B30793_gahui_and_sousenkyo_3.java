import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// if-else문으로 (예비결과 / 최종 결과) 값에 따른 문자 유형 출력
public class B30793_gahui_and_sousenkyo_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		double v = Double.parseDouble(s[0]) / Double.parseDouble(s[1]); // 예비결과 / 최종 결과
		if (v < 0.2) {
			System.out.println("weak");
		} else if (0.2 <= v && v < 0.4) {
			System.out.println("normal");
		} else if (0.4 <= v && v < 0.6) {
			System.out.println("strong");
		} else if (0.6 <= v) {
			System.out.println("very strong");
		}
		br.close();
	}
}