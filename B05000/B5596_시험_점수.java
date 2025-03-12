import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5596_시험_점수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum[] = new int[2]; // 점수 총점 ([0]: 민국, [1]: 만세)
		for (int i = 0; i < 2; i++) {
			String score[] = br.readLine().split(" "); // 한 사람의 점수
			for (int j = 0; j < 4; j++) {
				sum[i] += Integer.parseInt(score[j]); // 점수 더하기
			}
		}
		System.out.println(Math.max(sum[0], sum[1])); // 더 큰 총점 출력
		br.close();
	}

}
