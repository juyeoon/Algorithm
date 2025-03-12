import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2845_파티가_끝나고_난_뒤 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int cnt = Integer.parseInt(s[0]) * Integer.parseInt(s[1]); // 전체 참석자 수
		s = br.readLine().split(" ");
		for (String str : s) {
			sb.append(Integer.parseInt(str) - cnt).append(" "); // 기사에 실린 참가자 수 - 전체 참석자 수
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
