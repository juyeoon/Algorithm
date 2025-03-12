import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// switch-case문으로 조건 분기
public class B28691_정보보호학부_동아리_소개 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		switch (br.readLine().charAt(0)) { // 동아리의 첫 글자
		case 'M':
			System.out.println("MatKor");
			break;
		case 'W':
			System.out.println("WiCys");
			break;
		case 'C':
			System.out.println("CyKor");
			break;
		case 'A':
			System.out.println("AlKor");
			break;
		case '$':
			System.out.println("$clear");
			break;
		}
		br.close();
	}
}