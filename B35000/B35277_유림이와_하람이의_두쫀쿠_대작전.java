import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 35277 - 유림이와 하람이의 두쫀쿠 대작전
// https://www.acmicpc.net/problem/35277
public class B35277_유림이와_하람이의_두쫀쿠_대작전 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int oneCost = 900 + 60 + 600 + 170 + 160 + 110;
		System.out.println(Integer.parseInt(br.readLine()) / oneCost);
		br.close();
	}
}
