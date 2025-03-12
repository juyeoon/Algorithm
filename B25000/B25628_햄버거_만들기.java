import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 만들 수 있는 햄버거의 개수는 (빵 개수 / 2)와  패티 수 중 최솟값만큼 만들 수 있음
public class B25628_햄버거_만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		System.out.println(Math.min(Integer.parseInt(s[0]) / 2, Integer.parseInt(s[1]))); // 만들 수 있는 햄버거 개수
		br.close();
	}
}