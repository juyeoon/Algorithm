import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// StringBuilder에  N을 N번 반복한 것을 저장한 후 저장된 것이 길이가 M보다 클 때 setLength()함수로 자르기
public class B11944_NN {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // N
		int M = Integer.parseInt(s[1]); // M
		for (int i = 0; i < N; i++) { // N을 N번 반복
			sb.append(s[0]);
		}
		if (s[0].length() * N > M) { // N을 N번 반복했을 때의 길이가 M보다 클 때 자르기
			sb.setLength(M);
		}
		System.out.println(sb); // 출력
		br.close();
	}
}