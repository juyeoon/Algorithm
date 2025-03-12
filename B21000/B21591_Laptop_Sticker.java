import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 노트북 너비의 양 옆에 1cm 이상 여분이 나와야하기 때문에 (노트북 너비) >= (스티커 너비) + 2 이어야 가능함
// 높이도 동일. 두 조건 모두 만족해야 가능함.
public class B21591_Laptop_Sticker {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int wc = Integer.parseInt(s[0]); // 노트북 너비
		int hc = Integer.parseInt(s[1]); // 노트북 높이
		int ws = Integer.parseInt(s[2]); // 스티커 너비
		int hs = Integer.parseInt(s[3]); // 스티커 높이
		System.out.println((wc >= ws + 2 && hc >= hs + 2) ? 1 : 0); // 출력
		br.close();
	}
}