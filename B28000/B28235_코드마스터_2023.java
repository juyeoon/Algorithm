import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//switch-case로 조건 분기 후 출력
public class B28235_코드마스터_2023 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		switch(br.readLine()) {
		case "SONGDO":
			System.out.println("HIGHSCHOOL");
			break;
		case "CODE":
			System.out.println("MASTER");
			break;
		case "2023":
			System.out.println("0611");
			break;
		case "ALGORITHM":
			System.out.println("CONTEST");
			break;
		}
		br.close();
	}
}