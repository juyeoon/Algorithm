import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 더하기 시작할 수(start)와 마지막으로 더할 수(end)를 포인터로 저장
// start가 N이하일 때만 반복하여 계산
// 합(sum) > N일 때 start 옮기기
// sum < N일 때 end 옮기기
// sum == N일 때 정답 개수(cnt) 카운트, start와 end 옮기기
public class B2018_수들의_합_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int start = 1; // 더하기 시작할 수
		int end = 1; // 마지막으로 더할 수
		int sum = 1; // 합한 값
		int cnt = 0; // 정답 개수
		while (start <= N) { // start가 N이하일 때만 반복하여 계산
			if (sum < N) {
				sum += ++end; // end 옮기기. 합 재계산
			} else if (sum > N) {
				sum -= start++; // start 옮기기. 합 재계산
			} else {
				cnt++; // 카운트
				sum -= start++; // start 옮기기. 합 재계산
				sum += ++end; // end 옮기기. 합 재계산
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}