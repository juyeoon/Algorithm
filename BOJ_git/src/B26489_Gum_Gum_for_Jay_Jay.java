import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// EOF를 사용하여 입력 행 개수 세기
public class B26489_Gum_Gum_for_Jay_Jay {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		int cnt = 0; // 행 개수
		while ((s = br.readLine()) != null) { // EOF
			cnt++;
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}