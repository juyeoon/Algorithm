import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/33538
// 왕복 시간 = 앞크롤 구간(l/f) + 배영 구간(l/b)
// 라이벌의 최고 기록과 비교하여 한 명이라도 왕복 시간이 더 짧은 학생이 있으면 "HOPE" 출력 아니면 "DOOMED" 출력
public class B33538_Crawling {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine()); // 수영장 길이
		int n = Integer.parseInt(br.readLine()); // 학생 수
		double t = Double.parseDouble(br.readLine()); // 관측된 라이벌 최고 기록
		boolean hope = false; // t를 이길 수 있는 학생 존재 여부
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double f = Double.parseDouble(st.nextToken()); // 앞크롤 속도
			double b = Double.parseDouble(st.nextToken()); // 배영 속도
			double time = (l / f) + (l / b); // 왕복 시간
			if (time + 1e-9 < t) { // 해당 학생이 이김
				hope = true;
				break;
			}
		}
		System.out.println(hope ? "HOPE" : "DOOMED"); // 출력
		br.close();
	}
}
