import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 점수를 배열에 넣어서 확인
public class B9076_점수_집계 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine()); 
			int score[] = new int[5]; // 점수
			for (int i = 0; i < 5; i++) { // input score[]
				score[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(score); // 오름차순 정렬
			if(score[3] - score[1] >= 4) { // 3개의 최저 최고가 4 차이가 나면 
				sb.append("KIN\n");
			}else {
				sb.append(score[1]+score[2]+score[3]).append("\n");
			}
			
		}
		System.out.println(sb); // 출력
		br.close();

	}
}
