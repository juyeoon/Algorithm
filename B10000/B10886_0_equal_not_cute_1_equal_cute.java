import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// cnt[]를 만들어서 [0]에는 0 개수, [1]에는 1 개수 저장 후 비교
public class B10886_0_equal_not_cute_1_equal_cute {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 표 수
		int[] cnt = new int[2]; // 0, 1의 개수 저장
		for (int i = 0; i < N; i++) { // 표 수 만큼 반복
			cnt[Integer.parseInt(br.readLine())]++; // 배열에 idx 맞춰서 개수 저장
		}
		System.out.println(cnt[0] > cnt[1] ? "Junhee is not cute!" : "Junhee is cute!"); // 비교 후 출력
		br.close();
	}
}
