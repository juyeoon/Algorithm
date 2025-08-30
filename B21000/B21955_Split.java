import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/21955
// String.substring()으로 앞, 뒤로 자르기
public class B21955_Split {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine(); // 자를 수(문자열)
		int mid = N.length() / 2; // 가운데 위치
		System.out.println(N.substring(0, mid) + " " + N.substring(mid)); // 출력
		br.close();
	}
}
