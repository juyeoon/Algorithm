import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/8932
// 각 종목에 대해 A, B, C를 배열에 저장
// 트랙인지 필드인지도 boolean 배열에 저장
// 7번(종목 개수) 반복하면서 트랙과 필드에 따라 다른 점수 식을 사용하여 총점 구하기
public class B8932_7종_경기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double A[] = { 9.23076, 1.84523, 56.0211, 4.99087, 0.188807, 15.9803, 0.11193 }; // A
		double B[] = { 26.7, 75, 1.5, 42.5, 210, 3.8, 254 }; // B
		double C[] = { 1.835, 1.348, 1.05, 1.81, 1.41, 1.04, 1.88 }; // C
		boolean track[] = { true, false, false, true, false, false, true }; // 트랙 경기와 필드 경기 구분 (true: 트랙)
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int sum = 0; // 총점
			StringTokenizer st = new StringTokenizer(br.readLine()); // 점수
			for (int i = 0; i < 7; i++) {
				int P = Integer.parseInt(st.nextToken()); // 현재 종목 점수
				if (track[i]) { // 트랙 경기
					sum += (int) (A[i] * Math.pow(B[i] - P, C[i]));
				} else { // 필드 경기
					sum += (int) (A[i] * Math.pow(P - B[i], C[i]));
				}
			}
			sb.append(sum).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
