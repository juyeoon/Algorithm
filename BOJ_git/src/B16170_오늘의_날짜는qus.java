import java.time.LocalDate;
import java.time.ZoneId;

// LocalDate 클래스 사용
public class B16170_오늘의_날짜는qus {
	public static void main(String[] args){
		LocalDate now = LocalDate.now(ZoneId.of("Europe/London")); // 세계표준시
		System.out.println(now.getYear()); // 연도
		int month = now.getMonthValue(); // 달
		System.out.println(month < 10 ? ("0" + month) : month); // 한자리 수면 맨 앞에 0을 붙임
		System.out.println(now.getDayOfMonth()); // 날짜
	}
}
