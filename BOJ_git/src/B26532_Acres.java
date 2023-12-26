import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 필요 옥수수 자루 수 => 에이커 / 5 => (평방야드 / 4840) / 5 를 올림한 값
public class B26532_Acres {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		double y = Integer.parseInt(s[0]) * Integer.parseInt(s[1]); // 직사각형 밭 넓이(평방야드)
		y = y / 4840 / 5; // 필요 자루 수 => 에이커 / 5 => 평방야드 / 4840 / 5
		System.out.println((int) Math.ceil(y)); // 올림값 출력
		br.close();
	}
}