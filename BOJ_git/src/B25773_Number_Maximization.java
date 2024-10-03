import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 수가 주어지면 이루어진 숫자를 전부 사용해서 만들 수 있는 최대의 수를 만드는 문제
// 각 숫자를 내림차순으로 정렬하면 최대의 수가 됨
public class B25773_Number_Maximization {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char c[] = br.readLine().toCharArray(); // 수를 숫자 단위로 나누기
		Arrays.sort(c); // 오름차순 정렬
		for (int i = c.length - 1; i >= 0; i--) { // 오름차순 역순(내림차순) 출력
			sb.append(c[i]);
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
