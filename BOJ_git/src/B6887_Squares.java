import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가장 크게 만들 수 있는 정사각형의 변의 길이는 (타일 개수의 제곱근에 소숫점 이하를 버린 값)
public class B6887_Squares {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 타일 개수
		sb.append("The largest square has side length ").append((int) Math.sqrt(N)).append(".");
		System.out.println(sb); // 출력
		br.close();
	}
}