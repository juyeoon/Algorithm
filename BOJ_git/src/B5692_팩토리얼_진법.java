import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력값의 길이가 최대 5이므로 1!부터 5!까지 미리 구하여 배열에 저장 후
// 입력값의 자리수에 맞게 곱하여 더하여 출력값 구하기
public class B5692_팩토리얼_진법 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int fac[] = new int[6]; // 1!부터 5!까지 저장
		fac[1] = 1;
		for (int i = 2; i < 6; i++) { // fac[] 채우기
			fac[i] = fac[i - 1] * i;
		}
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOI
			int ans = 0; // 출력값
			int i = 1; // 팩토리얼 배열 인덱스
			int j = s.length() - 1; // 입력값 인덱스
			while (j >= 0) { // 입력값 길이만큼 반복
				ans += (s.charAt(j--) - '0') * fac[i++]; // 자리수를 팩토리얼 진법으로 변환 후 합하기
			}
			sb.append(ans).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}