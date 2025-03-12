import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 전반전에 문제를 푼 사람의 수 * 2보다 후반전에 문제를 푼 사람의 수가 적으면 어려움 아니면 쉬움
public class B30214_An_EasyPeasy_Problem {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int s1 = Integer.parseInt(s[0]); // 전반전이 끝났을 때 문제를 푼 사람의 수
		int s2 = Integer.parseInt(s[1]); // 후반전이 끝났을 때 문제를 푼 사람의 수
		System.out.println(s1 * 2 < s2 ? 'H' : 'E'); // 출력
		br.close();
	}
}