import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 모음을 미리 배열에 저장해놓고 문자열을 배열과 비교
public class B1264_모음의_개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		int check[] = { 65, 69, 73, 79, 85, 97, 101, 105, 111, 117 }; // 모음의 대소문자 아스키코드
		while (!(s = br.readLine()).equals("#")) { // EOF
			int sum = 0; // 모음 개수
			int leng = s.length(); // 문자열 길이
			for (int i = 0; i < leng; i++) {
				char c = s.charAt(i); // 문자열의 문자
				for (int j : check) { // 모음이랑 대조
					if (c == j) { // 모음이면
						sum++; // 개수 +1
						break;
					}
				}
			}
			sb.append(sum).append("\n"); // 개수 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}