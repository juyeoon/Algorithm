import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/33192
// 휴일 시간(h)은 무조건 시급의 2배로 계산 (표준 140시간 한도와 무관)
// 휴일이 아닌 시간(k-h) 중, 140시간까지는 일반 근무, 140시간 초과분은 초과근무 (1.5배)
// 휴일 급여: 2*x*h
// 일반 급여: x*일반 근무 시간
// 초과 급여: 1.5*x*초과 근무 시간 = x*초과 근무 시간+(x/2)*초과 근무 시간
public class B33192_Divar_s_Salaries {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 직원 수
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long x = Long.parseLong(st.nextToken()); // 시급
			int k = Integer.parseInt(st.nextToken()); // 이번 달 총 근무 시간
			int h = Integer.parseInt(st.nextToken()); // 휴일 근무 시간
			int nonHoliday = k - h; // 휴일이 아닌 근무 시간
			int baseHours = Math.min(140, nonHoliday); // 일반 근무 시간
			int overtimeHours = Math.max(0, nonHoliday - 140); // 초과 근무 시간
			long holidayPay = 2L * x * h; // 휴일 급여
			long normalPay = x * (long) baseHours; // 일반 급여
			long overtimePay = x * (long) overtimeHours + (x / 2) * (long) overtimeHours; // 초과 급여
			long total = holidayPay + normalPay + overtimePay;
			sb.append(String.format("%,d", total)).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
