import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력 문자열을 공백으로 분리하고 첫번째 단어를 제외한 단어들을 체크
// 첫 번째 단어는 어떤 단어든 상관없이 첫 문자 출력 저장
// 두 번째 단어부터 무시할 문자인지 확인 후 무시할 문지가 아니면 첫 문자 출력 저장
// 출력 저장된 문자열을 모두 대문자로 바꾼 후 출력
public class B3181_줄임말_만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()); // 첫 번째 단어
		sb.append(st.nextToken().charAt(0)); // 첫 단어의 첫 번째 문자 추가
		while (st.countTokens() > 0) { // 모든 단어 확인
			String s = st.nextToken();
			boolean add = false; // 추가할 단어인지 확인(false: 추가 안함)
			switch (s) {
			// 무시할 문자면 그대로 break
			case "i":
				break;
			case "pa":
				break;
			case "te":
				break;
			case "ni":
				break;
			case "niti":
				break;
			case "a":
				break;
			case "ali":
				break;
			case "nego":
				break;
			case "no":
				break;
			case "ili":
				break;
			// 전부 추가할 문자면 flag 체크
			default:
				add = true;
				break;
			}
			if (add) { // 추가할 단어면
				sb.append(s.charAt(0)); // 단어의 첫번째 문자 추가
			}
		}
		System.out.println(sb.toString().toUpperCase()); // 출력문을 모두 대문자로 바꿔서 출력
		br.close();
	}
}