import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/24510
// 각 코드를 char 배열에 저장한 후 한 문자씩 확인
// "for", "while" 등장 횟수를 세기(배열 인덱스 주의)
// 최대 등장 횟수 갱신하여 코드 다 확인하고 최댓값 출력
public class B24510_시간복잡도를_배운_도도 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 코드 줄의 개수
		int max = 0; // 최대 등장 횟수
		for (int i = 0; i < n; i++) { // 코드
			char c[] = br.readLine().toCharArray(); // 코드
			int cnt = 0; // 등장 횟수
			int leng = c.length; // 반복문 종료 조건
			for (int j = 0; j < leng; j++) {
				if (j < leng - 2 && c[j] == 'f' && c[j + 1] == 'o' && c[j + 2] == 'r') { // "for"
					cnt++;
					j += 2;
				} else if (j < leng - 4 && c[j] == 'w' && c[j + 1] == 'h' && c[j + 2] == 'i' && c[j + 3] == 'l'
						&& c[j + 4] == 'e') { // "while"
					cnt++;
					j += 4;
				}
			}
			max = Math.max(cnt, max); // max 갱신
		}
		System.out.println(max); // 출력
		br.close();
	}
}
