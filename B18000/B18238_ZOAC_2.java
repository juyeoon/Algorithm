import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이전 알파벳을 기준 문자(처음은 'A')로 두고 기준 문자와 현재 문자의 차이를 구해서(아스키코드)
// 알파벳 순서대로 돌렸을 때의 거리와 역순으로 돌렸을 때의 거리 차 중 최솟값을 합에 더해주고
// 기준 문자를 현재 문자로 변경
// 을 반복하고 합 출력
public class B18238_ZOAC_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c[] = br.readLine().toCharArray(); // 입력 문자열
		int leng = c.length; // 문자열의 문자 개수
		int sum = 0; // 문자열 출력 최소값
		char pre = 'A'; // 기준 문자
		for (int i = 0; i < leng; i++) {
			int diff = Math.abs(pre - c[i]); // 기준 문자와 현재 문자 사이의 거리 (알파벳 순서)
			sum += Math.min(diff, 26 - diff); // 알파벳 순서대로 돌렸을 때의 거리와 역순으로 돌렸을 때의 거리 차 중 최솟값을 더하기
			pre = c[i]; // 기준 문자를 현재 문자로
		}
		System.out.println(sum); // 출력
		br.close();
	}
}