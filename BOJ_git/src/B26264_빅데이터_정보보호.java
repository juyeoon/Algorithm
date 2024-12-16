import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26264
// 's'와 'b'는 각 단어에 한 번씩만 들어가기 때문에 해당 문자의 등장 횟수를 카운트해서
// 개수에 맞게 비교하여 출력
public class B26264_빅데이터_정보보호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine(); // 입력 문자열
		int sCnt = 0; // security 개수
		int bCnt = 0; // bigdata 개수
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 's') { // security
				sCnt++;
			} else if (c == 'b') { // bigdata
				bCnt++;
			}
		}
		if (sCnt > bCnt) { // security가 더 많음
			System.out.println("security!");
		} else if (sCnt < bCnt) { // bigdata가 더 많음
			System.out.println("bigdata?");
		} else { // 개수가 같음
			System.out.println("bigdata? security!");
		}
		br.close();
	}
}
