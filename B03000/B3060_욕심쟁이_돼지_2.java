import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이전 섭취 사료량의 합과 현재 섭취 사료량의 합을 비교하면
// 현재 섭취 사료량의 합 = (이전 섭취 사료량의 합 = 전체 돼지의 이전 섭취 사료량의 합)
// + (맞은편 돼지의 이전 사료량의 합 = 전체 돼지의 이전 섭취 사료량의 합)
// + (이전 번호 돼지의 이전 사료량의 합= 전체 돼지의 이전 섭취 사료량의 합)
// + (다음 번호 돼지의 이전 사료량의 합 = 전체 돼지의 이전 섭취 사료량의 합)
// = (전체 돼지의 이전 섭취 사료량의 합)*4
// 따라서 돼지 사료량의 합을 4배씩하여 N이 넘는지 확인만 해주면 된다.
public class B3060_욕심쟁이_돼지_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 전체 사료량
			int pig[] = new int[6]; // 첫날 돼지 섭취량
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 6; i++) { // input pig[]
				pig[i] = Integer.parseInt(st.nextToken());
			}
			int days = 1;
			long sum = Arrays.stream(pig).sum(); // 그 날 섭취 사료량의 합
			while (N >= sum) { // 섭취 사료량의 합이 전체 사료량 보다 커질 때까지 반복
				sum *= 4; // 이전 섭취량의 4배
				days++; // 날 + 1
			}
			sb.append(days).append("\n"); // sb에 저장
		}
		System.out.println(sb); // 출력
		br.close(); 
	}
}
