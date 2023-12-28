import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 찬성 수와 반대 수를 확인한 후 찬성 표가 더 많으면 카운트를 문제 후보의 수만큼 반복 후 카운트 출력
public class B30999_민주주의 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 문제 후보의 수
		int M = Integer.parseInt(s[1]); // 출제위원의 수
		int ans = 0; // 출제될 문제의 수
		for (int i = 0; i < N; i++) {
			String inp = br.readLine(); // 출제위원의 찬반 의견
			int o = 0; // 찬성 수
			int x = 0; // 반대 수
			for (int j = 0; j < M; j++) {
				if (inp.charAt(j) == 'O') { // 찬성
					o++;
				} else { // 반대
					x++;
				}
			}
			if (o > x) { // 찬성 표가 더 많으면
				ans++;
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}