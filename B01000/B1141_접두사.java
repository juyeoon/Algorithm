import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

// 길이 내림차순으로 정렬하여 set에 삽입(중복 제거)
// 삽입 조건: set에 있는 단어 중 그 단어로 시작하는 단어가 있으면 추가 X((set에 있는 단어).indexOf(비교 대상 단어)==0 사용)
public class B1141_접두사 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringBuilder sb = new StringBuilder();
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(br.readLine()); // 단어의 개수
		String[] words = new String[N]; // 단어 배열
		for (int i = 0; i < N; i++) { // input
			words[i] = br.readLine();
		}
		// 길이 내림차순으로 정렬
		Arrays.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s2.length(), s1.length());
			}
		});
		HashSet<String> set = new HashSet<>(); // 조건에 맞는 단어들의 집합
		for (String s1 : words) {
			if (set.size() == 0) { // 첫 번째 단어(길이가 제일 긴 단어)일 때
				set.add(s1);
				continue;
			}
			// set에 있는 문자열 중에 s1으로 시작하는 것이 있으면 추가 X
			boolean available = true; // 추가 가능한지 체크(true: 추가 가능)
			for (String s2 : set) {
				if (s2.indexOf(s1) == 0) { // s1으로 시작하는 것이 있으면
					available = false; // 추가 불가능
					break;
				}
			}
			if (available) { // 추가 가능하면
				set.add(s1); // 추가
			}
		}
		System.out.println(set.size());
		br.close();
	}
}
