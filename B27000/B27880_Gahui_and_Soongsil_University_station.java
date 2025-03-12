import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력은 4줄. 출력은 각 줄의 연산값의 합
// 문자열 첫 문자가 'E'(에스컬레이터)이면 입력값 * 21(cm)
// 그 외의 경우(계단)이면 입력값 * 17(cm)
public class B27880_Gahui_and_Soongsil_University_station {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0; // 총 높이
		for (int i = 0; i < 4; i++) {
			String s[] = br.readLine().split(" ");
			if (s[0].charAt(0) == 'E') { // 에스컬레이터인 경우
				sum += 21 * Integer.parseInt(s[1]);
			} else { // 계단인 경우
				sum += 17 * Integer.parseInt(s[1]);
			}
		}
		System.out.println(sum); // 출력
		br.close();
	}
}