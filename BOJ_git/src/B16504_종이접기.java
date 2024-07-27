import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 마지막에 모든 수가 합쳐진 1x1 조각이 남기 때문에 입력받은 수를 모두 더한 값이 정답
public class B16504_종이접기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 가로세로 길이
		long sum = 0; // 수의 합
		for (int i = 0; i < N; i++) { // 행
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) { // 열
				sum += Integer.parseInt(st.nextToken()); // 합 구하기
			}
		}
		System.out.println(sum); // 출력
		br.close();
	}
}
