import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34552
// 분위별 장학금을 저장한 후 장학금 취득 조건에 맞으면 분위에 해당하는 장학금을 총 장학금에 추가 
public class B34552_디딤돌_장학금 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] M = new int[11]; // 분위별 장학금
		for (int i = 0; i < 11; i++) { // M[] 채우기
			M[i] = Integer.parseInt(st.nextToken());
		}
		int N = Integer.parseInt(br.readLine()); // 재학생의 수
		int ans = 0; // 학교가 지출하는 장학금 총액
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int B = Integer.parseInt(st.nextToken()); // 학생의 분위
			double L = Double.parseDouble(st.nextToken()); // 학생의 학기 평점
			int S = Integer.parseInt(st.nextToken()); // 학생의 취득 학점
			if (L >= 2.0 && S >= 17) { // 현재학기 취득 17학점 이상 및 학기 평점 2.0 이상
				ans += M[B]; // 분위에 해당하는 장학금 추가
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
