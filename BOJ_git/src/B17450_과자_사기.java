import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 가성비 = (무게 * 10) / (가격 * 10 + (가격 * 10이 5000원 이상이면 - 500)
// 반복문을 사용하기 위해 max값을 따로 두어 반복할 때마다 비교하여 갱신하는 방법 사용
public class B17450_과자_사기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double maxCe = Integer.MIN_VALUE; // 최고 가성비의 값
		int maxNum = -1; // 최고 가성비를 가지는 번호
		for (int i = 0; i < 3; i++) { // 3번 반복
			StringTokenizer st = new StringTokenizer(br.readLine());
			double p = Double.parseDouble(st.nextToken()); // 가격
			double w = Double.parseDouble(st.nextToken()); // 무게
			double ce = (w * 10) / (p * 10 - (p * 10 >= 5000 ? 500 : 0)); // 가성비
			if (maxCe < ce) { // 가성비 갱신
				maxCe = ce;
				maxNum = i;
			}
		}
		if (maxNum == 0) { // S이 최고의 가성비
			System.out.println("S");
		} else if (maxNum == 1) { // N이 최고의 가성비
			System.out.println("N");
		} else { // U이 최고의 가성비
			System.out.println("U");
		}
		br.close();
	}
}