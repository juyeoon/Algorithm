import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (트레이너 요구 키 - 현재 키)를 종양 크기로 나누고 나머지가 있으면 +1 없으면 +0
public class B8710_Koszykarz {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int k = Integer.parseInt(s[0]); // 현재 키
		int w = Integer.parseInt(s[1]); // 트레이너 요구 키
		int m = Integer.parseInt(s[2]); // 종양 크기
		System.out.println(((w - k) % m != 0) ? (w - k) / m + 1 : (w - k) / m); // 출력
		br.close();
	}
}