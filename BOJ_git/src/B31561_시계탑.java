import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 30분까지 2배로 감 => 가리키는 분침의 /2가 현재 시각
// 30분 이후로는 2/3배로 감 => 6부터 12까지의 30이 45분이므로 30분에서 가리키는 분침까지의 실제 시각을 x라고 두면,
// 30:45 = (가리키는 분침 - 30):x
// x = (가리키는 분침 - 30) * 45 / 30
// 6까지 15분이 지났으므로 현재 시각은 (가리키는 분침 - 30) * 45 / 30 + 15
public class B31561_시계탑 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double M = Double.parseDouble(br.readLine()); // 바뀐 시계탑의 분침이 가리키는 분
		if (M <= 30) { // 30분까지 2배로
			M /= 2;
		} else { // 30분 이후부터는 2/3배로
			M = (M - 30) / 30 * 45 + 15;
		}
		System.out.println(String.format("%.1f", M)); // 출력
		br.close();
	}
}