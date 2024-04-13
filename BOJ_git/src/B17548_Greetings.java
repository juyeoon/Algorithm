import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열 "he...ey"의 "e...e"를 두 배로 늘려서 출력하는 문제 
// substring()으로 앞의 'h'와 뒤의 'y' 지운 후 "h" + "e...e" 두 번 + "y" 출력
public class B17548_Greetings {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 문자열
		s = s.substring(1, s.length() - 1); // 앞의 'h'와 뒤의 'y' 지우기
		System.out.println("h" + s + s + "y"); // "e...e"를 두 배로 늘려서 출력
		br.close();
	}
}