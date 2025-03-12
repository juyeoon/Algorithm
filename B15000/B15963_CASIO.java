import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 필요한 배터리와 가져온 배터리가 같으면 1 아니면 0 출력 (입력 수 범위 체크)
public class B15963_CASIO {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" "); // 필요한 배터리, 가져온 배터리
		System.out.println(Long.parseLong(s[0]) == Long.parseLong(s[1]) ? 1 : 0); // 출력
		br.close();
	}
}
