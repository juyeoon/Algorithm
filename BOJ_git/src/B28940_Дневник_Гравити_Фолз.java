import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한 페이지에 넣을 수 있는 글자 수를 구한 후 총 글자수를 나누어 일기 페이지 수 구하기
public class B28940_Дневник_Гравити_Фолз {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int w = Integer.parseInt(s[0]); // 페이지 너비
		int h = Integer.parseInt(s[1]); // 페이지 높이
		s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]); // 글자수
		int a = Integer.parseInt(s[1]); // 글자 너비
		int b = Integer.parseInt(s[2]); // 글자 높이
		int ans = -1; // 페이지 안에 글자를 넣을 수 없으면 -1
		if (w >= a && h >= b) { // 페이지 안에 글자를 넣울 수 있으면
			int wMax = w / a; // 한 줄에 넣을 수 있는 글자 수
			int hMax = h / b; // 한 페이지에 넣을 수 있는 줄 수
			ans = n / (wMax * hMax) + (n % (wMax * hMax) > 0 ? 1 : 0); // 일기 페이지 수
		}
		System.out.println(ans); // 출력
		br.close();
	}
}