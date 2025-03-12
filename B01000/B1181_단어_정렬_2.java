import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//Comparator 사용
//정렬 후 출력 시 중복 제거
//28660KB 272ms
public class B1181_단어_정렬_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 단어 개수
		String s[] = new String[N]; // input
		for (int i = 0; i < N; i++) {
			s[i] = br.readLine();
		} // input
		Arrays.sort(s, new Comparator<String>() { // 정렬
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
		sb.append(s[0]).append("\n");
		for (int i = 1; i < N; i++) {
			if (s[i].equals(s[i - 1]))
				continue; // 중복 제거
			sb.append(s[i]).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
