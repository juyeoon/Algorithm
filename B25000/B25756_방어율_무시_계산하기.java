import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/33571
// 누적 방어 무시율 V가 있고, 추가 방어 무시율 A를 적용할 경우
// V_new = A + V - V * A / 100
public class B25756_방어율_무시_계산하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 물약의 개수
		double V = 0.0; // 누적 방어율 무시 수치
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			double A = Double.parseDouble(st.nextToken());// 현재 물약의 방어율 무시 수치 (% 단위)
			V = A + V - V * A / 100; // 누적 방어율 무시 계산
			sb.append(V).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
