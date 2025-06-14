import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5190
// 해당 단 동안 로켓이 상승한 거리 = v * t + 0.5 * a * t * t
// 속도 증가량(v) = v + a * t
// 순가속도(a) = 해당 단의 추력 / 해당 단포함 무게 - 중력가속도
public class B5190_Aerospace_and_Mechanical_Engineering {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()); // 데이터 세트
		for (int ds = 1; ds <= K; ds++) {
			sb.append("Data Set ").append(ds).append(":\n"); // 출력 형식
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			int n = Integer.parseInt(st.nextToken()); // 로켓 단(stage) 개수
			double M = Double.parseDouble(st.nextToken()); // 로켓 본체 무게
			double[] m = new double[n]; // 단마다의 무계
			double[] t = new double[n]; // 단이 작동하는 시간
			double[] F = new double[n]; // 단이 작동 중 생성하는 추력(힘)
			double allM = M; // 남은 단의 무게의 합
			for (int i = 0; i < n; i++) { // 단의 정보 입력
				st = new StringTokenizer(br.readLine());
				m[i] = Double.parseDouble(st.nextToken());
				t[i] = Double.parseDouble(st.nextToken());
				F[i] = Double.parseDouble(st.nextToken());
				allM += m[i];
			}
			double v = 0; // 속도 증가량
			double h = 0; // 누적 높이
			for (int i = 0; i < n; i++) {
				double a = F[i] / allM - 9.81; // 순가속도
				h += v * t[i] + 0.5 * a * t[i] * t[i]; // 높이 계산
				v = v + a * t[i]; // 속도 변화 계산
				allM -= m[i]; // 분리된 단 무게 제외
			}
			sb.append(String.format("%.2f\n", h)); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
