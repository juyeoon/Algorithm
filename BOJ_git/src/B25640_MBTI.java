import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 진호의 mbti를 입력 받은 후 문자열 비교를 통해서 mbti를 비교 후 같으면 카운트
public class B25640_MBTI {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String mbti = br.readLine(); // 진호의 mbti
		int N = Integer.parseInt(br.readLine()); // 비교할 mbti 개수
		int cnt = 0; // 같은 mbti 개수
		for (int i = 0; i < N; i++) {
			if (br.readLine().equals(mbti)) { // 비교해서 같으면
				cnt++; // 카운트 증가
			}
		}
		System.out.println(cnt); // 카운트 출력
		br.close();
	}
}