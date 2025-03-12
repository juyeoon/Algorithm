import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// B와 C 개수(양말 짝)를 센 후 각각을 /2한 몫(양말 쌍)의 합 출력
public class B26742_Skarpetki {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 문자열
		int cntB = 0; // 흰 양말짝 개수
		int cntC = 0; // 검은 양말짝 개수
		for (int i = 0; i < s.length(); i++) { // 양말짝 개수만큼 반복
			if (s.charAt(i) == 'B') { // 흰 양말
				cntB++;
			} else { // 검은 양말
				cntC++;
			}
		}
		System.out.println(cntB / 2 + cntC / 2); // 흰 양말쌍 + 검은 양말쌍 출력
		br.close();
	}
}