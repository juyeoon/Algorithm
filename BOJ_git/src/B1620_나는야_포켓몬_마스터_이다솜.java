import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 번호로 이름 찾을 때는 String[] 사용
// 이름으로 번호를 찾을 때는 HashMap<String, Integer> 사용
public class B1620_나는야_포켓몬_마스터_이다솜 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 포켓몬 수
		int M = Integer.parseInt(s[1]); // 문제 수
		Map<String, Integer> dic = new HashMap<>(); // <이름, 번호>
		String name[] = new String[N + 1]; // [번호] = 이름
		for (int i = 1; i <= N; i++) { // input
			String temp = br.readLine();
			dic.put(temp, i);
			name[i] = temp;
		}
		for (int i = 0; i < M; i++) {
			String input = br.readLine(); // 들어온 문자열
			char first = input.charAt(0); // 첫번째 문자
			if ((first >= 65 && first <= 90) || (first >= 97 && first <= 122)) { // 첫번째 문자가 문자(영어)
				sb.append(dic.get(input)).append("\n"); // HashMap으로 찾기
			} else { // 첫번째 문자가 숫자
				sb.append(name[Integer.parseInt(input)]).append("\n"); // String arr로 찾기
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
