import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Comparator 사용
// 정렬 전 중복 제거
// 33832KB 476ms
public class B1181_단어_정렬_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 단어 개수
		List<String> input = new ArrayList<>(); // input
		for (int i = 0; i < N; i++) {
			input.add(br.readLine());
		} // input
		List<String> result = input.stream().distinct().collect(Collectors.toList()); // 중복 제거
		Collections.sort(result, new Comparator<String>() { // 정렬
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) { // 길이 같을 때
					return o1.compareTo(o2); // 사전순 정렬
				} else if (o1.length() > o2.length()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		// 출력
		for (String str : result) {
			sb.append(str).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
