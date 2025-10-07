import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/6794
// 입력이 1~10까지이기 때문에 규칙을 찾는 것보다 미리 정답을 배열에 저장해 놓고 입력값에 따라 출력하게 설정
public class B6794_What_is_n_Daddy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] ans = { 1, 2, 2, 3, 3, 3, 2, 2, 1, 1 }; // 입력값에 따른 출력 값(0-based)
		System.out.println(ans[Integer.parseInt(br.readLine()) - 1]); // 출력
		br.close();
	}
}
