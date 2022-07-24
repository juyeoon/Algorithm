import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;

// LocalDate.now() 사용
public class B10699_오늘_날짜 {
	public static void main(String[] args) throws IOException {
		System.out.println(LocalDate.now(ZoneId.of("Asia/Seoul")));
	}
}