import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 시작과 끝을 자유롭게 정할 수 있기 때문에 이동비용 중 최댓값을 제외한 합을 구함
public class B14487_욱제는_효도쟁이야 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 이동비용 개수
		String s[] = br.readLine().split(" ");
		int sum = 0; // 이동비용 합
		int max = 0; // 최대 이용비용
		int tmp = 0;
		for (int i = 0; i < N; i++) {
			tmp = Integer.parseInt(s[i]);
			sum += tmp; // 합 갱신
			if (max < tmp) { // 최댓값 갱신
				max = tmp;
			}
		}
		System.out.println(sum - max); // 최댓값을 제외한 합 출력
		br.close();
	}
}