import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34384
// 다음 정각까지 남은 시간(rem) = 3600(1시간 = 3600초)에서 (현재 초 % 3600)을 뺀 값
// 정각 1분(60초) 이내에는 일어나야 하므로, 잘 수 있는 최대 분은 rem초를 60초 단위로 올림(ceil)한 값
public class B34384_Hard_Rocks_and_Atomic_Clocks {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine()); // 자정 이후 지난 초
		int rem = 3600 - (s % 3600); // 다음 정각까지 남은 초
		int ans = (rem + 59) / 60; // 올림 계산하여 분 단위로 변환
		System.out.println(ans); // 출력
		br.close();
	}
}
