import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력이 'I'와 'l' 두 경우 뿐이므로 문자가 'l'이면 대문자인 'L'을 출력하고 아니면 'i'를 출력
public class B32288_바코드_닉네임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문자열 길이
		char c[] = br.readLine().toCharArray(); // 문자열
		for (int i = 0; i < N; i++) {
			sb.append(c[i] == 'l' ? 'L' : 'i'); // 대소문자 변환 후 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
