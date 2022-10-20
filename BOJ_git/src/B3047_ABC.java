import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 입력 받은 숫자를 오름차순으로 정렬한 다음
// 순서대로 A, B, C 할당 후 문자에 따른 숫자 출력
public class B3047_ABC {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" "); // 입력 받은 숫자
		int num[] = new int[3]; // 숫자를 오름차순으로 저장할 배열
		for (int i = 0; i < 3; i++) { // input num[]
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num); // 오름차순으로 정렬
		String abc = br.readLine(); // 입력받은 문자열
		for (int i = 0; i < 3; i++) {
			char c = abc.charAt(i); // 문자열의 문자
			if (c == 'A') { // A이면
				sb.append(num[0]); // 첫 번째로 작은 수
			} else if (c == 'B') { // B이면
				sb.append(num[1]); // 두 번째로 작은 수
			} else { // C이면
				sb.append(num[2]); // 세 번째로 작은 수
			}
			sb.append(" ");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}