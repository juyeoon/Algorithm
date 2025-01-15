import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/4909
// 6개의 점수 중에 최저, 최고점을 뺀 평균 값을 구하는 문제
// 6개 숫자 정렬 후 최저, 최고점 빼기
// 출력에서 소숫점 밑 숫자가 없으면 소숫점 없이 출력
public class B4909_Judging_Olympia {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0 0 0 0 0")) { // EOI
			StringTokenizer st = new StringTokenizer(s);
			int num[] = new int[6]; // 점수 목록
			for (int i = 0; i < 6; i++) { // num[] 채우기
				num[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(num); // 정렬
			double ans = num[1] + num[2] + num[3] + num[4]; // 최저, 최고점을 뺀 합
			ans /= 4; // 평균 구하기
			if (ans % 1 != 0) { // 출력 형식 맞추기
				sb.append(ans);
			} else {
				sb.append((int) ans);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
