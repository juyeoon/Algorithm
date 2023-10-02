import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// switch-case로 조건 분기 후 출력
public class B27889_특별한_학교_이름 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		switch (br.readLine()) {
		case "NLCS":
			System.out.println("North London Collegiate School");
			break;
		case "BHA":
			System.out.println("Branksome Hall Asia");
			break;
		case "KIS":
			System.out.println("Korea International School");
			break;
		case "SJA":
			System.out.println("St. Johnsbury Academy");
			break;
		}
		br.close();
	}
}