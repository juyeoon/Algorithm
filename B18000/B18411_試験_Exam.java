import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 점수를 오름차순으로 정렬 후 최고점 2개 합 출력
public class B18411_試験_Exam {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int score[] = new int[3]; // 점수
		for (int i = 0; i < 3; i++) { // insert score[]
			score[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(score); // 오름차순 정렬
		System.out.println(score[1] + score[2]); // 최고점 2개 합 출력
		br.close();
	}
}