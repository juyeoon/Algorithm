import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 길이가 1이 될때까지 while을 반복하고 반복할 때마다 카운트
// 각 자리 수의 합을 구해서 처음 입력 받은 변수에 다시 넣어주기
// 마지막에 남은 한 자리 수가 3,6,9가 아니면 NO 출력
public class B1769_3의_배수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력받은 수
		int cnt = 0; // 문제 변환 횟수
		while (s.length() > 1) { // 한자리 수가 될때까지 반복
			cnt++; // 횟수 카운트
			int sum = 0; // 각 자리 수의 합
			int leng = s.length(); // for 종료 조건
			for (int i = 0; i < leng; i++) { // 합 구하기
				sum += (s.charAt(i) - '0');
			}
			s = Integer.toString(sum); // 다시 string형으로 변환
		}
		int ans = Integer.parseInt(s); // int형으로 변환 (출력 조건문 편하게 쓰기 위해)
		System.out.println(cnt); // 횟수 출력
		System.out.println((ans == 3 || ans == 6 || ans == 9) ? "YES" : "NO"); // 3의 배수 여부 출력
		br.close();
	}
}