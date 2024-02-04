import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열의  if-else문을 사용해서 문자별로 반대되는 문자 출력
public class B20540_연길이의_이상형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 영길이의 MBTI
		if (s.charAt(0) == 'I') { // 첫 번째 지표
			sb.append("E");
		} else {
			sb.append("I");
		}
		if (s.charAt(1) == 'S') { // 두 번째 지표
			sb.append("N");
		} else {
			sb.append("S");
		}
		if (s.charAt(2) == 'T') { // 세 번째 지표
			sb.append("F");
		} else {
			sb.append("T");
		}
		if (s.charAt(3) == 'J') { // 네 번째 지표
			sb.append("P");
		} else {
			sb.append("J");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}