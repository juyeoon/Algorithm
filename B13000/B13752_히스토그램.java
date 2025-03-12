import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 받은 수 만큼 "="을 sb에 더한 후 "\n" 더하는 걸 테스트케이스 수 만큼 반복
public class B13752_히스토그램 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine()); // 히스토그램 크기
			for (int j = 0; j < k; j++) {
				sb.append("="); // "=" 더하기
			}
			sb.append("\n"); // 개행
		}
		System.out.println(sb); // 출력
		br.close();
	}
}