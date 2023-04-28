import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1부터 T까지 출력 형식에 맞게 반복하여 출력하는 문제 (다른 입력은 필요 없음)
public class B24724_현대모비스와_함께하는_부품_관리 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 부품 관리 횟수
		for (int i = 1; i <= T; i++) { // 출력 형식에 맞게 출력 저장
			sb.append("Material Management ").append(i).append("\n");
			sb.append("Classification ---- End!\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}