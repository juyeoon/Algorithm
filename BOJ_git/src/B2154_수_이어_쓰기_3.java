import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1부터 N까지 숫자를 붙인 문자열 생성한 후 indexOf()로 위치 찾기
public class B2154_수_이어_쓰기_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 찾을 수
		for (int i = 1; i <= N; i++) { // 1부터 N까지 숫자를 붙인 문자열 생성
			sb.append(i);
		}
		System.out.println(sb.toString().indexOf(Integer.toString(N)) + 1); // indexOf()로 위치를 찾은 후 출력
		br.close();
	}
}