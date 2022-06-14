import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 재환이 말할 수 있는 길이보다 의사가 원하는 길이가 길면 no, 그 외 go
public class B4999_아bang {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine(); // 재환이 말하는 '아'
		String s2 = br.readLine(); // 의사가 원하는 '아'
		System.out.println(s1.length() >= s2.length() ? "go" : "no");
	}
}
