import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 홀수 짝수 구분 => 2로 나눈 나머지가 0이면 짝수
// 짝수 개수를 구한 후 홀수 개수(전체 개수 - 짝수 개수)보다 짝수 개수가 더 많으면 Happy 출력. 그 외에는 Sad 출력
public class B29163_Счастье_Мистера_Бина {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 전체 수 개수
		String s[] = br.readLine().split(" ");
		int evenCnt = 0; // 짝수 개수
		for (int i = 0; i < n; i++) { // 짝수 개수 구하기
			int tmp = Integer.parseInt(s[i]);
			if (tmp % 2 == 0) {
				evenCnt++;
			}
		}
		if (evenCnt > (n - evenCnt)) { // 짝수 개수 > 홀수 개수
			System.out.println("Happy");
		} else { // 그 외
			System.out.println("Sad");
		}
		br.close();
	}
}