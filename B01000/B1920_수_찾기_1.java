import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


// Set(.contains()) 사용
// 64868 KB 584 ms
public class B1920_수_찾기_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 정수 개수
		String s[] = br.readLine().split(" ");
		Set<Integer> set = new HashSet<>(); // 정수(input) 집합
		for (int i = 0; i < N; i++) {
			set.add(Integer.parseInt(s[i]));
		} // input
		int M = Integer.parseInt(br.readLine());// 확인할 수 개수
		s = br.readLine().split(" ");
		for (int i = 0; i < M; i++) {
			sb.append(set.contains(Integer.parseInt(s[i])) ? 1 : 0).append("\n");
		} // 존재 확인
		System.out.println(sb);
		br.close();
	}
}
