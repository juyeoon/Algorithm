import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이전 사료량과 현재 사료량 배열을 따로 두어 돼지 번호(0~5)마다 사료량 계산하여 저장 후 현재 사료량 배열을 이전 사료량 배열에 복사. 합이 전체 사료량보다 많아지면 종료
// 맞은 편 돼지 번호 = (i + 3) % 6
// 이전 돼지 번호  = (i + 5) % 6
// 다음 돼지 번호 = (i + 1) % 6
public class B3060_욕심쟁이_돼지_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 전체 사료량
			int previous[] = new int[6]; // 이전 사료량
			int now[] = new int[6]; // 현재 사료량
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 6; i++) { // 첫날 사료량을 previous에 입력
				previous[i] = Integer.parseInt(st.nextToken());
			}
			int days = 1;
			long sum = Arrays.stream(previous).sum(); // 그 날 섭취 사료량의 합
			while (N >= sum) { // 섭취 사료량의 합이 전체 사료량 보다 커질 때까지 반복
				for (int i = 0; i < 6; i++) { // 현재 사료량 계산
					now[i] = previous[i] + previous[(i + 3) % 6] + previous[(i + 5) % 6] + previous[(i + 1) % 6];
				}
				sum = Arrays.stream(now).sum(); // 현재 사료량 계산
				previous = Arrays.copyOf(now, now.length); // 현재 사료량을 이전 사료량에 복사
				days++; // 날 + 1
			}
			sb.append(days).append("\n"); // sb에 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
