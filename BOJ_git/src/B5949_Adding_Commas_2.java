import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

// https://www.acmicpc.net/problem/5949
// 방법2) java의 DecimalFormat을 사용하여 콤마 찍기
public class B5949_Adding_Commas_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat formatter = new DecimalFormat("###,###"); // 콤마 숫자 패턴
		System.out.println(formatter.format(Long.parseLong(br.readLine()))); // 출력
		br.close();
	}
}
