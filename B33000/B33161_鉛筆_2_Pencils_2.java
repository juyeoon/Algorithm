import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33161
// 5엔짜리 연필을 살 수 있는 최대 개수 = 총 금액 / 5
public class B33161_鉛筆_2_Pencils_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 총 금액
		System.out.println(N / 5); // 5엔짜리 연필을 살 수 있는 최대 개수
		br.close();
	}
}
