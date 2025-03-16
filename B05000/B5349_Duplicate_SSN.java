import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// https://www.acmicpc.net/problem/5349
// 입력되는 번호 중에 중복되는 번호만 오름차순으로 정렬하여 출력하는 문제
// 중복되는 번호를 하나씩만 오름차순으로 출력하기 위해 TreeSet 사용
// 중복인지 확인하기 위해서 HashSet 사용
public class B5349_Duplicate_SSN {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		Set<String> numbers = new HashSet<>(); // 지금까지 나온 번호
		Set<String> dup = new TreeSet<>(); // 중복되는 번호
		while (!(s = br.readLine()).equals("000-00-0000")) { // EOI
			if (numbers.contains(s)) { // 중복이면
				dup.add(s);
			} else { // 중복이 아니면
				numbers.add(s);
			}
		}
		for (String dupnum : dup) { // 중복되는 번호만 출력 저장
			sb.append(dupnum).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
