import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/28135
// 선우가 1부터 숫자를 셀 때, 주어진 수 N이 몇 번째로 세어지는지 구하기
// 1부터 숫자를 증가시키며 세면서, "50"이 포함된 숫자는 한 번 더 세기
// 매번 숫자를 셀 때마다 cnt를 증가시키며, 현재 숫자가 N이면 몇 번째인지 출력
public class B28135_Since_1973 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력값 N (찾고자 하는 수)
		int cnt = 0; // 선우가 센 총 횟수
		int num = 0; // 현재 숫자
		while (true) {
			num++; // 다음 숫자로 이동
			cnt++; // 한 번 셈
			if (num == N) { // 현재 숫자가 N이라면 현재까지 센 횟수 출력 후 종료
				System.out.println(cnt);
				break;
			}
			if (String.valueOf(num).contains("50")) { // 숫자에 "50"이 포함되어 있다면 한 번 더 셈
				cnt++; // 한 번 더 셈
				if (num == N) { // 두 번째로 셀 때 N이라면 해당 cnt 출력 후 종료
					System.out.println(cnt);
					break;
				}
			}
		}
		br.close();
	}
}
