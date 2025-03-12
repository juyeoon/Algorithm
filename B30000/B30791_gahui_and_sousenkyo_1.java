import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 경쟁력이 있는 캐릭터의 수는 16등과 득표수가 1000이하로 차이나는 캐릭터의 수
public class B30791_gahui_and_sousenkyo_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int sixteenth = Integer.parseInt(s[0]); // 16등의 득표수
		int cnt = 0; // 16등과 득표수가 1000이하로 차이나는 캐릭터의 수(경쟁력이 있는 캐릭터의 수)
		for (int i = 1; i < 5; i++) {
			if (sixteenth - 1000 <= Integer.parseInt(s[i])) { // 다음 등수의 캐릭터가 경쟁력이 있으면
				cnt++; // 카운트
			} else { // 경쟁력이 없으면 이후의 캐릭터도 경쟁력이 없음
				break; // 반복문 탈출
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}