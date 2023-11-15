import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1x1 타일을 2개씩 묶은 것과 개수가 같음 => 벽의 크기 / 2
public class B15700_타일_채우기_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		long N = Integer.parseInt(s[0]); // 가로 크기
		long M = Integer.parseInt(s[1]); // 세로 크기
		System.out.println(N * M / 2); // 출력
		br.close();
	}
}
