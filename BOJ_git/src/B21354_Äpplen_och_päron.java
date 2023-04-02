import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Axel이 번 돈 = Axel이 판매한 사과의 수 * 7
// Petra가 번 돈 = Petra가 판매한 배의 수 * 13
public class B21354_Äpplen_och_päron {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]) * 7; // Axel이 번 돈
		int P = Integer.parseInt(s[1]) * 13; // Petra가 번 돈
		if (A == P) { // 같을 때
			System.out.println("lika");
		} else { // 다를 때
			System.out.println((A > P) ? "Axel" : "Petra");
		}
		br.close();
	}
}