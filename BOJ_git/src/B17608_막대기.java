import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 입력의 뒤에서부터 최대값을 확인하고 최대값을 갱신할 때마다 카운트하여 카운트 수 출력
// 뒤에서부터 확인하기 때문에 스택을 사용하여도 되지만 배열을 사용하는 편이 시간이 적게 걸리기 때문에 배열 사용
public class B17608_막대기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 막대기 개수
		int height[] = new int[N]; // 막대기 배열
		for (int i = 0; i < N; i++) { // input height[]
			height[i] = Integer.parseInt(br.readLine());
		}
		int max = height[N - 1]; // 막대 최대 높이
		int cnt = 1; // 보이는 막대 개수(카운트)
		for (int i = N - 2; i >= 0; i--) { // 뒤에서부터 확인
			if (max < height[i]) { // 최댓값을 갱신할 때
				max = height[i]; // 최댓값 갱신
				cnt++; // 카운트
			}
		}
		System.out.println(cnt); // 출력
		br.readLine();
	}
}