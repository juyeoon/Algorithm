import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한 사람이 다른 숫자를 낼 때 그 사람의 기호 출력
// 그 이외의 경우 * 출력
public class B13623_Zero_or_One {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int C = Integer.parseInt(s[2]);
		if ((A == 0 && B == 1 && C == 1) || (A == 1 && B == 0 && C == 0)) { // A가 다른 것을 냈을 때
			System.out.println("A");
		}else if((A == 1 && B == 0 && C == 1) || (A == 0 && B == 1 && C == 0)) { // B가 다른 것을 냈을 때
			System.out.println("B");
		}else if((A == 1 && B == 1 && C == 0) || (A == 0 && B == 0 && C == 1)) { // C가 다른 것을 냈을 때
			System.out.println("C");
		}else { // 그 외
			System.out.println("*");
		}
		br.close();
	}
}