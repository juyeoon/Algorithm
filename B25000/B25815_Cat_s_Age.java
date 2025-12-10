import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25815
// 각 구간의 개월 수의 차이는 각각 4+5+6, 4+5, 4이므로,
// 나이를 총 개월 수로 변환한 후, 전체 개월 수를 기반으로 4개월 환산을 먼저 적용한 뒤
// 환산 비율이 더 높은 구간(2년 이내, 1년 이내)에 대해 보정값을 더해 최종 사람 개월 수를 계산
public class B25815_Cat_s_Age {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		m += y * 12; // 나이를 전체 개월 수로 변환
		int age = 0; // 변환 개월 수
		// 모든 개월을 사람 나이 환산 시 최소 4개월로 계산
		age += m * 4;
		// 0~24개월 구간은 4개월보다 높은 환산율이므로 추가 보정
		// 2년 이내 구간은 실제 대비 5개월 차이 보정 (9-4)
		m = Math.min(m, 24);
		age += m * 5;
		// 1년 이내 구간은 실제 대비 6개월 추가 보정 (15-9)
		m = Math.min(m, 12);
		age += m * 6;
		System.out.println(age / 12 + " " + age % 12); // 출력
		br.close();
	}
}
