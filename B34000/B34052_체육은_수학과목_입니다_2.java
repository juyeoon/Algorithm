import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34052
// 1~4바퀴의 시간을 입력받아 합하고 마지막 바퀴 300초까지 더한 시간이 1800 이하면 "Yes" 아니면 "No"
public class B34052_체육은_수학과목_입니다_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0; // 1~4바퀴 시간 합
		for (int i = 0; i < 4; i++) { // sum 구하기
			sum += Integer.parseInt(br.readLine());
		}
		// 마지막 바퀴 300초를 더한 시간이 1800 이하면 "Yes"
		System.out.println(sum + 300 <= 1800 ? "Yes" : "No");
		br.close();
	}
}
