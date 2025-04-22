import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25286
// m월 m일에서 m일을 빼기
// 월이 바뀔 경우 해당 월의 마지막 날로 설정하고, 윤년일 경우 2월은 29일로 처리
public class B25286_11월_11일 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 각 월별 일 수
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int year = Integer.parseInt(st.nextToken()); // 연도
			int month = Integer.parseInt(st.nextToken()); // 월
			int day = month; // 일
			int minus = month; // m일 전을 계산하기 위해 뺄 일 수
			while (minus > 0) { // 뺄 수만큼 날짜를 앞으로 되돌리기
				if (day > minus) { // 현재 월 안에서 뺄 수 있으면 그냥 빼고 종료
					day -= minus;
					break;
				} else { // 현재 월의 날짜보다 더 많이 빼야 하는 경우
					minus -= day; // 이번 달 날 수만큼 빼고 전 달로 이동
					month--; // 이전 달로 이동
					if (month == 0) { // 1월에서 더 이전으로 갈 경우 12월로 돌아감
						month = 12;
						year--; // 연도 감소
					}
					day = days[month]; // 이전 달의 마지막 날로 설정
					if (month == 2) { // 2월일 경우 윤년인지 확인하고 일 수 조정
						if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
							day = 29; // 윤년이면 2월은 29일
						}
					}
				}
			}
			// 결과 저장
			sb.append(year).append(" ").append(month).append(" ").append(day).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}