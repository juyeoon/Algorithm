import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/4613
// 아스키코드를 사용해서 문자를 숫자로 변환 후 quicksum 구하기
public class B4613_Quicksum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("#")) { // EOI
			int quickSum = 0; // quicksum
			int leng = s.length();
			for (int i = 0; i < leng; i++) { // quicksum 구하기
				if (s.charAt(i) != ' ') { // 공백 무시
					quickSum += (s.charAt(i) - 'A' + 1) * (i + 1);
				}
			}
			sb.append(quickSum).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
