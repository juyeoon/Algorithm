import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 사과 수 % 학생 수를 합하여 출력
public class B10833_사과 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 학교 수
		int sum = 0; // 나머지 합
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int student = Integer.parseInt(st.nextToken()); // 학생 수
			int apple = Integer.parseInt(st.nextToken()); // 사과 수
			sum += apple % student; // 나머지를 합치기
		}
		System.out.println(sum); // 출력
		br.close();
	}
}