import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// https://www.acmicpc.net/problem/10420
// DateTimeFormatter로 날짜를 "yyyy-MM-dd"형식으로 사용
// LocalDate.parse()로 시작 날짜를 저장
// LocalDate.plusDays()로 기념일만큼 날짜 더하기
// 시작 날짜가 1일 째이므로 기념일 - 1만큼 더하기
public class B10420_기념일_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // 날짜를 원하는 형식으로 출력하기 위함
		LocalDate date = LocalDate.parse("2014-04-02", formatter); // 시작 날짜를 LocalDate로 변환
		int anniversary = Integer.parseInt(br.readLine()); // 구할 기념일
		System.out.println(date.plusDays(anniversary - 1).format(formatter)); // 구할 기념일을 더한 날짜 출력
		br.close();
	}
}
