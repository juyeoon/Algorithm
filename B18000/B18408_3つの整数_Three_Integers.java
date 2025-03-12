import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1과 2 중 최빈값을 출력
public class B18408_3つの整数_Three_Integers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int cnt[] = new int[3]; // [1]: 1 개수 , [2]: 2 개수
		for (int i = 0; i < 3; i++) { // 개수 세기
			cnt[Integer.parseInt(s[i])]++;
		}
		System.out.println(cnt[1] > cnt[2] ? 1 : 2); // 최빈값 출력
		br.close();
	}
}