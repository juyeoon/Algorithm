import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 올려야 하는 스탯 수(축복 사용 횟수) = 기준 평균(N)에 대한 총 스탯의 합 - 현재 스탯의 합
// = (N * 스탯 개수) - 현재 스탯의 합
// 위의 값이 음수가 나올 경우 이미 평균이 N이상이므로 축복이 필요하지 않음
public class B30468_호반우가_학교에_지각한_이유_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int sum = 0; // 네 가지 스탯의 합
		for (int i = 0; i < 4; i++) { // sum 구하기
			sum += Integer.parseInt(st.nextToken());
		}
		int N = Integer.parseInt(st.nextToken()); // 기준 평균 스탯 수치
		int ans = N * 4 - sum; // 올려야 하는 스탯 수
		bw.write(ans > 0 ? String.valueOf(ans) : "0"); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}