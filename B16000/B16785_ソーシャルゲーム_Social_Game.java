import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16785
// 한 주에 얻을 수 있는 코인을 계산하고, 목표 코인을 채우기 위해 몇 주를 반복할 수 있는지와 남은 코인을 계산
// 경우 1: 계산한 주차 수만큼 로그인하고 남은 코인을 하루씩 채우는 경우의 총 일수
// 경우 2: 1주를 더 로그인하여 남은 코인을 보너스를 포함해 한 번에 채우는 경우의 총 일수
// 두 경우 중 더 적은 로그인 횟수를 출력
public class B16785_ソーシャルゲーム_Social_Game {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()); // 하루 로그인 시 얻는 코인 수
		int B = Integer.parseInt(st.nextToken()); // 7일 연속 로그인 시 추가로 받는 보너스 코인
		int C = Integer.parseInt(st.nextToken()); // 목표 코인 수
		int oneWeek = 7 * A + B; // 7일간 연속 로그인 시 얻는 총 코인 수
		int weekCnt = C / oneWeek; // 목표 코인 C를 채우기 위해 필요한 전체 주차 수
		int remain = C - oneWeek * weekCnt; // 주차별로 얻은 코인을 제외하고 남은 코인 수
		// 경우 1: weekCnt 주차만큼 로그인하고, 남은 코인을 하루씩 추가로 로그인하여 채우는 경우의 총 일수
		int case1 = weekCnt * 7 + (remain + A - 1) / A;
		// 경우 2: 1주 더 로그인해서 목표 코인을 초과해서 채우는 경우의 총 일수
		int case2 = (weekCnt + 1) * 7;
		System.out.println(Math.min(case1, case2)); // 출력
		br.close();
	}
}
