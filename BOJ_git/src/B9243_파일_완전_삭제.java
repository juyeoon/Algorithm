import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N이 홀수일 때 두 입력 문자열의 각각 자리수가 같으면 제대로 삭제 X
// N이 짝수일 때 두 입력 문자열의 각각 자리수가 같지 않으면 제대로 삭제 X
// 그 이외의 경우에는 제대로 삭제 O
public class B9243_파일_완전_삭제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 삭제 횟수
		String s1 = br.readLine(); // 처음 비트
		String s2 = br.readLine(); // 삭제 후 비트
		boolean del = true; // 제대로 삭제 여부
		if (N % 2 == 1) { // N이 홀수
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(i)) { // 자리수가 같으면 제대로 삭제 X
					del = false;
					break;
				}
			}
		} else { // N이 짝수
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) { // 자리수가 같지 않으면 제대로 삭제 X
					del = false;
					break;
				}
			}
		}
		System.out.println(del ? "Deletion succeeded" : "Deletion failed"); // 출력
		br.close();
	}
}