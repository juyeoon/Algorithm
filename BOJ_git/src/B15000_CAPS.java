import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// .toUpperCase() 메소드를 이용하여 대문자로 변환
public class B15000_CAPS {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine().toUpperCase()); // 입력받은 문자열을 대문자로 변환 후 출력
		br.close();
	}
}