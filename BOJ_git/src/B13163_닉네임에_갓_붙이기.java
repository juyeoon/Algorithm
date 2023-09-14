import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 공백으로 분할 후 "god"에 분할된 두번째 단어부터 끝까지 붙이기
public class B13163_닉네임에_갓_붙이기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 닉네임 개수
		for (int i = 0; i < N; i++) {
			String s[] = br.readLine().split(" ");
			sb.append("god"); // god 붙이기
			for (int j = 1; j < s.length; j++) { // 두번째 단어부터 붙이기
				sb.append(s[j]);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}