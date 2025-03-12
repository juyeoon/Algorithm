import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 'A'가 1이 되기 위해선 문자에 64를 빼기(아스키코드)
public class B15813_너의_이름은_몇_점이니 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine()); // 이름의 길이
		String s = br.readLine(); // 이름
		int sum = 0; // 이름 점수 합
		for (int i = 0; i < L; i++) { // 이름 길이만큼 반복
			char c = s.charAt(i); // 이름의 문자
			sum += c - 64; // 점수 갱신
		}
		System.out.println(sum); // 출력
		br.close();
	}
}