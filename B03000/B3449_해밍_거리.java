import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 같은 자리의 값이 다르면 카운트. 카운트 출력
public class B3449_해밍_거리 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			String s1 = br.readLine(); // 이진수 1
			String s2 = br.readLine(); // 이진수 2
			int leng = s1.length(); // 이진수 길이
			int cnt = 0; // 다른 자리수 개수
			for (int i = 0; i < leng; i++) { // 길이만큼 반복
				if (s1.charAt(i) != s2.charAt(i)) { // 다르면
					cnt++; // 카운트
				}
			}
			sb.append("Hamming distance is ").append(cnt).append(".\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}