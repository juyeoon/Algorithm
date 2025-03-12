import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 왼쪽 뿔 수와 오른쪽 뿔 수를 입력 받은 후 비교하여 조건에 맞게 출력
public class B15025_Judging_Moose {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int l = Integer.parseInt(s[0]); // 왼쪽 뿔
		int r = Integer.parseInt(s[1]); // 오른쪽 뿔
		if (l == 0 && r == 0) { // 둘 다 0이면 무스가 아님
			System.out.println("Not a moose");
		} else if (l == r) { // 두 수가 같으면 아무값 * 2
			System.out.println("Even " + (l + r));
		} else { // 두 수가 다르면 최댓값 * 2
			System.out.println("Odd " + (Math.max(l, r) * 2));
		}
		br.close();
	}
}