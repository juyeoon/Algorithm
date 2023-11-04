import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// switch-case문으로 입력 문자열에 따른 조건 분기
public class B28290_안밖_밖안_계단_역계단 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		switch (br.readLine()) {
		case "fdsajkl;":
		case "jkl;fdsa": // 안밖
			System.out.println("in-out");
			break;
		case "asdf;lkj":
		case ";lkjasdf": // 밖안
			System.out.println("out-in");
			break;
		case "asdfjkl;": // 계단
			System.out.println("stairs");
			break;
		case ";lkjfdsa": // 역계단
			System.out.println("reverse");
			break;
		default: // 전부 아님
			System.out.println("molu");
		}
		br.close();
	}
}