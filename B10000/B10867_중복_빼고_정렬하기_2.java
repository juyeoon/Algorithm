import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// boolean배열 사용 // 23332KB 232ms
public class B10867_중복_빼고_정렬하기_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		boolean check[] = new boolean[2001]; // 0~2000(-1000~1000)
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			check[Integer.parseInt(s[i]) + 1000] = true;
		} // input(index를 숫자로)
		for (int i = 0; i < 2001; i++) {
			if (check[i]) sb.append(i - 1000).append(" ");
		} // true인 것만 출력
		System.out.println(sb);
		br.close();
	}
}
