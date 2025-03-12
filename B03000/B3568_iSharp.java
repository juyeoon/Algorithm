import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//3568 - iSharp
public class B3568_iSharp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" "); // 선언을 공백 기준으로 나눔
		String common = s[0]; // 공통 변수형
		for (int i = 1; i < s.length; i++) { // 변수명(+추가적인 변수형)
			sb.append(common); // 공통 변수형을 출력에 추가
			char[] cc = s[i].toCharArray(); // char 배열로
			StringBuilder temp = new StringBuilder(); // 임시 스트링 빌더(변수명 앞 변수형, 변수명 저장)
			int idx = 0;
			while (cc[idx] == '&' || cc[idx] == '*' || cc[idx] == '[' || cc[idx] == ']') { // 변수명 앞 변수형
				temp.append(cc[idx++]);
			}
			String front = temp.toString();
			temp.setLength(0); // 스트링 빌더 리셋
			while ((idx < cc.length - 1) && !(cc[idx] == '&' || cc[idx] == '*' || cc[idx] == '[' || cc[idx] == ']')) { // 변수명
				temp.append(cc[idx++]);
			}
			for (int j = cc.length - 2; j >= idx; j--) { // 변수명 뒤 변수형(거꾸로)
				if (cc[j] != ']') { // 배열 기호가 아니면
					sb.append(cc[j]); // 그대로 추가
				} else { // 배열 기호면
					j--; // 인덱스 하나 더 줄이고
					sb.append("[]"); // 배열 기호 추가
				}
			}
			// + 변수명 앞 변수형 + 공백 + 변수명 + 세미콜론
			sb.append(front).append(" ").append(temp.toString()).append(";").append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
