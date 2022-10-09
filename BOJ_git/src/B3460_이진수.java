import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10진수를 2진수로 바꾼 다음 2진수를 String으로 변환 후
// 뒤에서부터 확인하면서 1 위치를 확인
public class B3460_이진수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 0; tc < T; tc++) {
			// 10진수를 2진수로 바꾼 다음 2진수를 String으로 변환
			String bi = Integer.toBinaryString((Integer.parseInt(br.readLine())));
			// 2진수를 뒤에서부터 확인하면서 1 위치를 확인(j: 뒤에서부터 확인용, i: 0부터 위치 출력용)
			for (int i = 0, j = bi.length() - 1; j >= 0; i++, j--) {
				if (bi.charAt(j) == '1') { // 1이면
					sb.append(i).append(" "); // 위치 추가
				}
			}
			sb.append("\n"); // 테스트케이스 개행
		}
		System.out.println(sb); // 출력
		br.close();
	}
}