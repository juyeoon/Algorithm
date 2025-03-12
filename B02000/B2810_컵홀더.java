import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// S는 무조건 컵홀더 사용 가능, LL은 처음 나온 LL만 둘 다 사용 가능 그 이후 LL은 한 명(오른쪽)만 사용 가능
// => S가 등장하면 +1, L이 등장하면 +1 & 다음 L 뛰어넘기. 그 후 L이 한번이라도 등장했으면 +1(맨 처음 LL은 둘 다 가능하기 때문)
public class B2810_컵홀더 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 사람 수
		String s = br.readLine(); // 좌석 배치
		int cnt = 0; // 컵홀더를 사용할 수 있는 사람 수
		boolean L = false; // LL 등장 여부
		for (int i = 0; i < s.length(); i++) {
			cnt++;
			if (s.charAt(i) == 'L') { // L이 등장하면
				L = true; // LL 등장 여부 갱신
				i++; // 다음 L 뛰어넘기
			}
		}
		System.out.println(L ? cnt + 1 : cnt); // L이 한번이라도 등장했으면 +1
		br.close();
	}
}