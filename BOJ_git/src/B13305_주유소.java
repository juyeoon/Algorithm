import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 그리디 알고리즘 => 처음부터 end까지 기름값이 제일 싼 곳 찾기, 기름값 제일 싼 곳부터 end까지 계산, end를 제일 싼 곳으로 -> 반복 
public class B13305_주유소 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 도시 개수
		st = new StringTokenizer(br.readLine()); // 도로 길이
		int[] road = new int[N - 1]; // 도로 길이 배열
		for (int i = 0; i < N - 1; i++) {
			road[i] = Integer.parseInt(st.nextToken());
		} // input road
		st = new StringTokenizer(br.readLine()); // 기름 가격
		int[] liter = new int[N]; // 기름 가격 배열
		for (int i = 0; i < N; i++) {
			liter[i] = Integer.parseInt(st.nextToken());
		} // input liter
		long cost = 0; // 비용
		int end = N - 1; // 계산할 범위의 바로 다음 인덱스 (0~end-1가 계산할 범위, 그 이후는 계산 완료)
		while (end > 0) {
			int minL = Integer.MAX_VALUE; // 기름 최솟값
			int minIdx = -1; // 기름 최솟값인 곳 인덱스
			for (int i = 0; i < end; i++) { // 기름 최솟값 찾기
				if (minL > liter[i]) {
					minL = liter[i];
					minIdx = i;
				}
			}
			long dis = 0; // 최솟값부터 end까지 총 거리
			for (int i = minIdx; i < end; i++) { // dis 계산
				dis += road[i];
			}
			cost += dis * minL; // 총 거리*기름값을 총 비용에 더해주기
			end = minIdx; // end를 기름 최솟값인 곳 인덱스로 바꿔주기
		}
		System.out.println(cost); // 총 비용 출력
		br.close();
	}
}