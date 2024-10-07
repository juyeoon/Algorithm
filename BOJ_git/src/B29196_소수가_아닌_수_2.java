import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// k는 최대 소수점 아래 여덟자리까지이며 q는 10^9이하이기 때문에 k는 어떤 수이든지 분모가 10의 제곱형태인 분수로 나타낼 수 있음
// 가능한 분수 중 무엇이든 하나를 출력하는 문제이므로 무조건 출력이 가능("YES" 출력)
// k를 정수 부분과 소수 부분으로 자르고 (split("\\."))
// 소수부분의 길이만큼의 10의 제곱을 분모(q)로
// 소수부분을 분자(p)로 저장한 다음 출력
// [주의] split에서 특정 특수기호를 사용할 때는 \\를 사용해야 함
public class B29196_소수가_아닌_수_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split("\\."); // 소수점으로 나누기
		int leng = s[1].length(); // 소수점 이하 자리수
		int q = (int) Math.pow(10, leng); // 10의 제곱수(소수점 자리수만큼의 제곱)
		int p = Integer.parseInt(s[1]); // 소수점 이하 수
		System.out.println("YES\n" + p + " " + q); // 출력
		br.close();
	}
}