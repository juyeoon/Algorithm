import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 'ABCDEFGHIJKLMNOPQRSTUVWXYZ_.'의 순서로 회전하는 암호 방식을 사용하여 뒤집힌 평문으로 암호문 구하는 문제 (문자열 -> 뒤집힌 문자열 -> 회전)
// 뒤집기 => 뒤에서부터 문자를 확인
// 회전하기 => 문자에 해당하는 인덱스를 가져와 N만큼 돌리고 원형을 살리기 위해 28을 나눈 나머지값으로 설정
// 문자로 인덱스 찾기 => Map 키: 문자, 값: 인덱스
// 인덱스로 문자 찾기 => 배열 인덱스: 인덱스, 값: 문자
// 평문 문자의 인덱스 찾기(Map) => 회전했을 때의 인덱스 찾기((인덱스 + 회전수)%문자개수) -> 회전한 인덱스에 해당하는 문자 찾기(배열)
public class B10347_Reverse_Rot {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char numal[] = new char[28]; // 인덱스로 문자 찾기 위한 배열
		Map<Character, Integer> alnum = new HashMap<>(); // 문자로 인덱스를 찾기 위한 맵
		char c = 'A'; // 저장 문자
		for (int i = 0; i < 26; i++) { // 알파벳과 해당하는 숫자 저장
			alnum.put(c, i); // 문자 -> 숫자 저장
			numal[i] = c++; // 숫자 -> 문자 저장
		}
		// '_'와 '.'에 대한 값 넣기
		numal[26] = '_';
		alnum.put('_', 26);
		numal[27] = '.';
		alnum.put('.', 27);
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOI
			StringTokenizer st = new StringTokenizer(s);
			int N = Integer.parseInt(st.nextToken()); // 회전량
			String msg = st.nextToken(); // 암호화할 메시지
			for (int i = msg.length() - 1; i >= 0; i--) { // 역순으로 바꾸기
				char tmp = msg.charAt(i); // 바꿀 문자
				// 문자에 해당하는 인덱스를 가져와 N만큼 돌리고 원형을 살리기 위해 28을 나눈 나머지값으로 설정
				int idx = (alnum.get(tmp) + N) % 28; // 암호화된 문자의 인덱스
				sb.append(numal[idx]); // 출력 저장
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}