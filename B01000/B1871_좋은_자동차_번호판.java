import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// '-'로 	분리 후
// 앞 => (문자 - 65) * 26의 제곱을 다 더하기
// 뒤 => int형으로 나누기
// 후 앞과 뒤를 비교
public class B1871_좋은_자동차_번호판 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 번호판 개수
		for (int tc = 0; tc < N; tc++) {
			String s[] = br.readLine().split("-"); // '-'로 나누기
			int first = 0; // 앞의 값
			int twosix = 26 * 26; // 26의 제곱
			for (int i = 0; i < 3; i++) { // 세 자리 알파벳을 수로 변환
				first += (s[0].charAt(i) - 65) * twosix;
				twosix /= 26;
			}
			int val = Math.abs(first - Integer.parseInt(s[1])); // 앞-뒤의 절댓값
			sb.append(val <= 100 ? "nice\n" : "not nice\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}