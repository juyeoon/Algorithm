import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34665
// 하차 후 15분 뒤에 승차하므로 시간 조건(1시간 이내)은 항상 만족.
// 따라서 A역과 B역의 이름이 완전히 같으면 같은 역에서 재승차한 것이므로 0원
// 다르면 재승차 환승 할인 X → 1550원
public class B34665_가희와_교통_요금 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine(); // A역 이름
		String B = br.readLine(); // B역 이름
		System.out.println(A.equals(B) ? 0 : 1550); // 출력
		br.close();
	}
}
