import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 9시 정각에서 입력 시분까지 몇 분이 경과했는지 출력하는 문제
// (시 - 9) * 60 + 분
public class B26307_Correct {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int HH = Integer.parseInt(s[0]); // 시
		int MM = Integer.parseInt(s[1]); // 분
		System.out.println((HH - 9) * 60 + MM); // 경과 분 출력
		br.close();
	}
}