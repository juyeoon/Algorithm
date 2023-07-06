import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력을 char 배열로 저장하여 배열 길이의 절반을 기준으로 앞과 뒤를 더하여 비교
public class B18406_럭키_스트레이트 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c[] = br.readLine().toCharArray(); // 입력 문자열
		int left = 0; // 배열 왼쪽의 합
		int right = 0; // 배열 오른쪽의 합
		for (int i = 0; i < c.length / 2; i++) { // left 계산
			left += c[i] - '0';
		}
		for (int i = c.length / 2; i < c.length; i++) { // right 계산
			right += c[i] - '0';
		}
		System.out.println(left == right ? "LUCKY" : "READY"); // 출력
		br.readLine();
	}
}