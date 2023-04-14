import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 홀수 짝수를 구분하는 문제. 2로 나눈 나머지가 있으면 홀수 없으면 짝수 
public class B10480_Oddities {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 입력 개수
		for (int i = 0; i < n; i++) { // 입력 개수만큼 반복
			int x = Integer.parseInt(br.readLine()); // 수
			sb.append(x).append(" is ").append((x % 2 == 0) ? "even\n" : "odd\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}