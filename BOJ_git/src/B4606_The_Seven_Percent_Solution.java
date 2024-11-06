import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 예약 문자를 %숫자로 인코딩하여 출력하는 문제
// 예약 문자를 key, %숫자를 value로 하는 hashmap을 생성하고
// 주어진 문자열의 문자를 하나씩 확인하면서 대체하기 
public class B4606_The_Seven_Percent_Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Character, String> map = new HashMap<>(); // 인코딩 문자 map
		map.put(' ', "%20");
		map.put('!', "%21");
		map.put('$', "%24");
		map.put('%', "%25");
		map.put('(', "%28");
		map.put(')', "%29");
		map.put('*', "%2a");
		String s = "";
		while (!(s = br.readLine()).equals("#")) { // EOI
			char c[] = s.toCharArray(); // 입력 문자열
			for (int i = 0; i < c.length; i++) { // 문자 하나씩 확인
				if (map.get(c[i]) == null) { // 해당 없음
					sb.append(c[i]);
				} else { // 해당 있음
					sb.append(map.get(c[i]));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
