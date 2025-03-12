import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//둘레 = 맨 밑의 직사각형 개수 * 4
public class B15894_수학은_체육과목_입니다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		System.out.println(N * 4);
		br.close();
	}
}
