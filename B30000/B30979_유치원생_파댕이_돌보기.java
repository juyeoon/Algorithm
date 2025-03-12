import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 사탕의 맛 F의 합이 T이상일 때 파댕이는 울지 않음. 그 외에는 욺
public class B30979_유치원생_파댕이_돌보기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 파댕이를 돌볼 시간
		int N = Integer.parseInt(br.readLine()); // 사탕 개수
		String s[] = br.readLine().split(" "); // 사탕의 맛 F
		int sum = 0; // 사탕의 맛의 합
		for (int i = 0; i < N; i++) { // sum 구하기
			sum += Integer.parseInt(s[i]);
		}
		System.out.println(T > sum ? "Padaeng_i Cry" : "Padaeng_i Happy"); // 출력
		br.close();
	}
}