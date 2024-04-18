import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 적어도 한 번 나타나는 정수를 작은 순서로 출력하는 문제
// boolean 배열을 사용하여 등장 여부를 저장한 후 등장한 수를 작은 순서로 출력
public class B31609_Appearing_Numbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 수 개수
		String s[] = br.readLine().split(" "); // 입력 수
		boolean num[] = new boolean[10]; // 수 등장 여부 저장(true: 등장)
		for (int i = 0; i < N; i++) { // 수 등장 여부 확인
			num[Integer.parseInt(s[i])] = true;
		}
		for (int i = 0; i < 10; i++) {
			if (num[i]) { // 등장 했으면
				sb.append(i).append("\n"); // 출력에 저장
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}