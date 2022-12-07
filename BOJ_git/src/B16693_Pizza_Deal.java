import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한 조각 피자 1달러당 받는 피자의 양 = A1(면적) / P1(가격)
// 전체 피자 1달러당 받는 피자의 양 = R1(반지름) * R1(반지름) * Math.PI / P2(가격)
public class B16693_Pizza_Deal {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A1 = Integer.parseInt(s[0]); // 한 조각 면적
		int P1 = Integer.parseInt(s[1]); // 한 조각 가격
		s = br.readLine().split(" ");
		int R1 = Integer.parseInt(s[0]); // 전체 피자 반지름
		int P2 = Integer.parseInt(s[1]); // 전체 피자 가격
		double piece = A1 * 1.0 / P1; // 한 조각 피자 1달러당 받는 피자의 양
		double whole = R1 * R1 * Math.PI / P2; // 전체 피자 1달러당 받는 피자의 양
		System.out.println(piece > whole ? "Slice of pizza" : "Whole pizza"); // 피자 양이 더 큰 걸 출력
		br.close();
	}
}