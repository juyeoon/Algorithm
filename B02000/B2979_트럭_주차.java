import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 트럭이 주차된 시간이 1~100 사이이므로 크기가 100인 배열을 생성하여 각 분마다 몇 대가 주차되어있는지 저장 후
// 배열을 순회하면서 (주차된 차량 수 * 해당 요금)을 더하여 출력
public class B2979_트럭_주차 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int fee[] = new int[4]; // 주차된 차량 당 요금
		for (int i = 1; i < 4; i++) { // input fee[]
			fee[i] = Integer.parseInt(st.nextToken());
		}
		int car[] = new int[101]; // 분 당 주차되어 있는 차량 수
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()); // 주차한 시각
			int end = Integer.parseInt(st.nextToken()); // 출차한 시각
			for (int j = start; j < end; j++) { // 주차 차량 수 갱신
				car[j]++;
			}
		}
		int ans = 0; // 상근이가 내야하는 주차 요금
		for (int i = 1; i < 101; i++) { // 주차되어 있는 차량 수 배열(car) 순회
			ans += car[i] * fee[car[i]]; // 주차된 차량 수 * 해당 요금을 더하기
		}
		System.out.println(ans); // 출력
		br.readLine();
	}
}