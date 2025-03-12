import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 받은 알파벳이 N이거나 n인지 확인
public class B24883_자동완성 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char alpha = br.readLine().charAt(0); // 입력받은 알파벳
		System.out.println((alpha == 'N' || alpha == 'n') ? "Naver D2" : "Naver Whale"); // 입력받은 알파벳에 따라 다르게 출력
		br.close();
	}
}