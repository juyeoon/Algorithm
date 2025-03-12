import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// HashSet 이용
public class B11723_집합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine()); // 명령 개수
		Set<Integer> set = new HashSet<>(); // 집합
		for (int i = 0; i < M; i++) {
			String s[] = br.readLine().split(" ");
			if (s[0].equals("add")) { // x 추가
				set.add(Integer.parseInt(s[1]));
			} else if (s[0].equals("remove")) { // x 삭제
				if (set.contains(Integer.parseInt(s[1])))
					set.remove(Integer.parseInt(s[1]));
			} else if (s[0].equals("check")) { // x가 있는지 체크
				sb.append(set.contains(Integer.parseInt(s[1])) ? "1\n" : "0\n");
			} else if (s[0].equals("toggle")) { // x가 있으면 삭제 없으면 추가ㄹ
				if (set.contains(Integer.parseInt(s[1]))) {
					set.remove(Integer.parseInt(s[1]));
				} else {
					set.add(Integer.parseInt(s[1]));
				}
			} else if (s[0].equals("all")) { // 1~20까지 추가
				for (int j = 1; j <= 20; j++) {
					set.add(j);
				}
			} else if (s[0].equals("empty")) { // 공집합
				set.clear();
			}
		}
		System.out.println(sb);
		br.close();
	}
}
