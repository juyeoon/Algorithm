import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

// 9945 - Centroid of Point Masses
// https://www.acmicpc.net/problem/9945
// 각 질점의 좌표 (xi, yi)와 질량 mi가 주어질 때, 전체 질점의 무게중심 (a, b)를 구하는 문제
// 질량을 가중치로 한 좌표의 평균을 구하기
public class B9945_Centroid_of_Point_Masses {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = 1; // 테스트케이스
		while (true) {
			String line = br.readLine();
			if (line.isEmpty()) {
				continue;
			}
			int n = Integer.parseInt(line);
			if (n < 0) { // 종료 조건
				break;
			}
			long sumM = 0; // 전체 질량 합
			long sumMX = 0; // mi * xi의 합
			long sumMY = 0; // mi * yi의 합
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				sumM += m;
				sumMX += (long) m * x; // 무게중심 x좌표
				sumMY += (long) m * y; // 무게중심 y좌표
			}

			double a = sumMX / (double) sumM;
			double b = sumMY / (double) sumM;
			sb.append("Case ").append(tc++).append(": ").append(String.format(Locale.US, "%.2f %.2f\n", a, b));
		}
		System.out.println(sb);
		br.close();
	}
}
