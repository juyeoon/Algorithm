import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

//HashSet으로 교집합 구하기
public class B1764_듣보잡 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		HashSet<String> hsN = new HashSet<>(); // 듣지 못 한 사람
		HashSet<String> hsM = new HashSet<>(); // 보지 못 한 사람
		for (int i = 0; i < N; i++) {
			hsN.add(br.readLine());
		} // input
		for (int i = 0; i < M; i++) {
			hsM.add(br.readLine());
		} // input
		hsN.retainAll(hsM); // 교집합
		List li = new ArrayList(hsN); // HashSet을 List로 변환
		Collections.sort(li); // 정렬
		sb.append(li.size()).append("\n"); // 개수 출력
		for (int i = 0; i < li.size(); i++) {
			sb.append(li.get(i)).append("\n"); // List 출력
		}
		System.out.println(sb);
		br.close();
	}
}
