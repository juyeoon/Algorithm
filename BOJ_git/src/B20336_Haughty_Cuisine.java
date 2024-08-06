import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력받은 세트 메뉴 중 하나를 골라 그 세트의 메뉴 수와 메뉴(순서 상관 X)를 출력
// => 첫번째로 입력받은 메뉴를 " "을 "\n"로 변환하여 출력
public class B20336_Haughty_Cuisine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine(); // 필요없는 입력 무시
		StringTokenizer st = new StringTokenizer(br.readLine());
		int end = st.countTokens(); // " "으로 끊었을 때의 단어 개수
		for (int i = 0; i < end; i++) { // " "을 "\n"으로 변경하여 출력
			sb.append(st.nextToken()).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
