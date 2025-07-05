import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5211
// 악보의 첫 마디부터 마지막에서 하나 앞의 마디까지 첫 음이 어떤 코드인지 확인 후 개수 세기
// 마지막 마디는 첫 음이 어떤 코드인지 개수를 마저 세고
// 마지막 마디의 마지막 음도 어떤 코드인지 확인
// C-major => C-major 첫음 개수가 더 많거나 첫음 개수가 같고 마지막 마디의 첫 음이 C-major
// A-minor => A-minor 첫음 개수가 더 많거나 첫음 개수가 같고 마지막 마디의 첫 음이 A-minor
public class B5211_가단조와_다장조 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "|"); // 입력을 마디 단위로 끊기
		int cm = 0; // C-major 첫음을 가지는 마디 개수
		int am = 0; // A-minor 첫음을 가지는 마디 개수
		while (st.countTokens() != 1) { // 마지막 마디는 마지막 음도 봐야하기 때문에 빼기
			char first = st.nextToken().charAt(0); // 마디의 첫 음
			if (first == 'C' || first == 'F' || first == 'G') { // C-major 첫음
				cm++;
			} else if (first == 'A' || first == 'D' || first == 'E') { // A-minor 첫음
				am++;
			}
		}
		String last = st.nextToken(); // 마지막 마디
		char lastFirst = last.charAt(0); // 마지막 마디의 첫 음
		char lastLast = last.charAt(last.length() - 1); // 마지막 마디의 마지막 음
		if (lastFirst == 'C' || lastFirst == 'F' || lastFirst == 'G') { // 마지막 마디의 첫 음 계산
			cm++;
		} else if (lastFirst == 'A' || lastFirst == 'D' || lastFirst == 'E') {
			am++;
		}
		// C-major 첫음 개수가 더 많거나 첫음 개수가 같고 마지막 마디의 첫 음이 C-major면 C-major
		if (cm > am || (cm == am) && (lastLast == 'C' || lastLast == 'F' || lastLast == 'G')) {
			System.out.println("C-major");
		} else { // 그 외에는 A-minor
			System.out.println("A-minor");
		}
		br.close();
	}
}
