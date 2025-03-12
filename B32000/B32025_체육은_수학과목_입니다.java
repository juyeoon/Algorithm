import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 운동장 안에서 그릴 수 있는 가장 커다란 원은 운동장 긴 변에 내접하는 원
// 반지름 = 지름 / 2
// 반지름 = (운동장 두 변의 길이 중 작은 길이) / 2
// 반지름(cm) = (운동장 두 변의 길이 중 작은 길이(m) * 100)(cm) / 2
public class B32025_체육은_수학과목_입니다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int H = Integer.parseInt(br.readLine()); // 운동장 한 변의 길이
		int W = Integer.parseInt(br.readLine()); // 운동장 다른 한 변의 길이
		System.out.println((int) (Math.min(H, W) / 2.0 * 100)); // 출력
		br.close();
	}
}
