import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34441
// 조건에 따라서 누적 배수를 구한 후 기본 시간에 곱한 후 시:분 단위로 변환하여 출력
public class B34441_Ski_Traffic {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hillName = br.readLine(); // 스키장 이름
		String timeStr = br.readLine(); // 기본 시간 h:m
		String[] hm = timeStr.split(":");
		int h = Integer.parseInt(hm[0]);
		int m = Integer.parseInt(hm[1]);
		int total = h * 60 + m; // 총 시간
		String day = br.readLine(); // 요일
		int badWeather = Integer.parseInt(br.readLine()); // I-70 날씨
		int snow = Integer.parseInt(br.readLine()); // Front Range 눈
		int holiday = Integer.parseInt(br.readLine()); // 공휴일
		long multi = 1; // 총 이동 시간에 곱할 값
		if (day.equals("sat") || day.equals("sun")) { // 주말이면 2배
			multi *= 2;
		}
		if (badWeather == 1) { // I-70 악천후면 2배
			multi *= 2;
		}
		if (snow == 1) { // Front Range에 눈이 오면 3배
			multi *= 3;
		}
		if (holiday == 1) { // 공휴일이면 3배
			multi *= 3;
		}
		long expected = total * multi; // 최종 예상 이동 시간
		long resultH = expected / 60;
		long resultM = expected % 60;
		System.out.printf("%d:%02d%n", resultH, resultM); // 출력
		br.close();
	}
}
