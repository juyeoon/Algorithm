import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1부터 k까지의 수를 차례대로 한 줄로 붙인 수 n이 주어졌을 때 k를 구하는 문제
// n의 범위가 10^9이므로 k는 9까지 가능
// 따라서 입력 문자열의 한 문자씩 확인해서 1부터 1씩 늘어나는 수인지 확인
// 중간에 맞지 않는 수가 들어가면 -1 출력. 아니면 마지막 숫자 출력
public class B31520_Champernowne_Verification {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 입력 문자열
		boolean chmap = true; // Champernowne 단어 여부 (true: 맞음)
		int k = 0; // k
		for (; k < s.length(); k++) {
			if (s.charAt(k) != (char) (k + 1 + '0')) { // 맞지 않는 수가 있으면
				chmap = false; // Champernowne 단어가 아님
				break;
			}
		}
		System.out.println(chmap ? k : -1); // Champernowne 단어 여부에 따른 출력
		br.close();
	}
}