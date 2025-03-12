import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 피타고라스 정리를 이용하여 직각삼각형 여부 확인
public class B7510_고급_수학 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Scenario #").append(tc).append(":\n");
			String s[] = br.readLine().split(" "); // 변의 길이(String)
			int num[] = new int[3]; // 변의 길이(int)
			for (int i = 0; i < 3; i++) { // input num[]
				num[i] = Integer.parseInt(s[i]);
			}
			Arrays.sort(num); // 오름차순으로 정렬
			long a2b2 = num[0] * num[0]; // a^2
			a2b2 += num[1] * num[1]; // a^2 + b^2
			long c2 = num[2] * num[2]; // c^2
			sb.append(a2b2 == c2 ? "yes\n\n" : "no\n\n"); // 직각삼각형 여부 출력
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}