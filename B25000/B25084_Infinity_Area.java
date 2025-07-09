import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25084
// boolean 변수로 다음 그릴 방향이 왼쪽인지 오른쪽인지 체크
// 다음 방향이 왼쪽: 반지름 곱하기 A
// 다음 방향이 오른쪽: 반지름 나누기 B
// R * R만 합하고 마지막에 pi를 곱하여 총 면적 계산
public class B25084_Infinity_Area {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Case #").append(tc).append(": "); // 출력 형식
			StringTokenizer st = new StringTokenizer(br.readLine());
			long R = Long.parseLong(st.nextToken()); // 첫 번째 원의 반지름
			long A = Long.parseLong(st.nextToken()); // 왼쪽 원을 그릴 때 반지름에 곱할 값
			long B = Long.parseLong(st.nextToken()); // 오른쪽 원을 그릴 때 반지름을 나눌 값
			double area = 0; // 면적의 합 (반지름의 합)
			boolean nextIsright = false; // 다음이 오른쪽이면 true, 왼쪽이면 false;
			while (R > 0) { // 반지름이 0이 될 때까지
				area += R * R; // 면적의 합 구하기 (pi 제외)
				if (nextIsright) { // 다음 그릴게 오른쪽이면 반지름 나누기 B
					R /= B;
				} else { // 다음 그릴 게 왼쪽이면 반지름 곱하기 A
					R *= A;
				}
				nextIsright = !nextIsright; // 뱡향 바꿈

			}
			sb.append(String.format("%.6f\n", area * Math.PI)); // pi를 곱해서 총 면적을 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
