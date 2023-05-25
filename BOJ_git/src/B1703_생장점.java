import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력 수를 2개씩 묶어서 앞의 수(한 가지당 잎의 수)는 곱하고 뒤의 수(가지치기한 가지 수)는 빼는 것을 반복
public class B1703_생장점 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("0")) {
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken()); // 나무의 나이(입력 수 2a개)
			int ans = Integer.parseInt(st.nextToken()); // 잎의 수
			for (int i = 1; i < a; i++) {
				ans -= Integer.parseInt(st.nextToken()); // 가지치기한 가지
				ans *= Integer.parseInt(st.nextToken()); // 가지당 잎의 수
			}
			ans -= Integer.parseInt(st.nextToken()); // 마지막 가지치기
			sb.append(ans).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}