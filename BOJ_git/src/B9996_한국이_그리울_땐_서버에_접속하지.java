import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

//졍규표현식과 Pattern 클래식 사용
public class B9996_한국이_그리울_땐_서버에_접속하지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String s[] = br.readLine().split("\\*"); // "*"로 분리 => "\\*" 사용(정규표현식에서 사용하는 기호는 \\ 필요)
		String patt = "^" + s[0] + "[a-z]*" + s[1] + "$"; // 정규표현식: "^시작([a-z]가 1개이상 있거나 없거나)끝$"
		for (int i = 0; i < N; i++) {
			String str = br.readLine(); // 확인할 문장
			boolean check = Pattern.matches(patt, str); // 정규표현식에 해당하는지 확인
			sb.append(check ? "DA\n" : "NE\n"); // YES or NO
		}
		System.out.println(sb);
		br.close();
	}
}
