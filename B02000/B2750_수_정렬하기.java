import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2750_수_정렬하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 수 개수
		boolean check[] = new boolean[2001]; // -1000~1000 // 인덱스로 수가 입력에 있는지(true) 없는지(false) 체크
		for (int i = 0; i < N; i++) { // input
			check[Integer.parseInt(br.readLine()) + 1000] = true; // -1000이면 [0]에 저장해야하므로 +1000
		}
		for (int i = 0; i < 2001; i++) { // output
			if (check[i])
				sb.append(i - 1000).append("\n"); //[0]이면 -1000을 출력해야하므로 -1000
		}
		System.out.println(sb);
		br.close();
	}
}
