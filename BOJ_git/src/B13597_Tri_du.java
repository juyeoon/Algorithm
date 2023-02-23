import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 받은 두 숫자가 같으면 트리오가 되는 것이 제일 높기 때문에 A나 B 출력
// 두 숫자가 다르면 둘 중 높은 숫자의 더블을 만들어야 하므로 최댓값 출력
public class B13597_Tri_du {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		if (A == B) {
			System.out.println(A);
		} else {
			System.out.println(Math.max(A, B));
		}
		br.close();
	}
}