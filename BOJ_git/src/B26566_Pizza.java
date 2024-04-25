import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 피자 조각의 면적(A1)과 가격(P1)과 피자 전체의 반지름(R1)과 가격(P2)이 주어졌을 때 어느 것을 골라야 이득을 볼 수 있는지를 계산하는 문제
// 조각과 전체 한 판의 단위 면적 당 가격을 구하여 더 작은 값을 가지는 피자를 선택
public class B26566_Pizza {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()); // 데이터 세트 개수
		for (int tc = 0; tc < N; tc++) {
			st = new StringTokenizer(br.readLine());
			double A1 = Double.parseDouble(st.nextToken()); // 피자 조각의 면적
			double P1 = Double.parseDouble(st.nextToken()); // 피자 조각의 가격
			double piece = P1 / A1; // 조각의 단위 면적 당 가격
			st = new StringTokenizer(br.readLine());
			double R1 = Double.parseDouble(st.nextToken()); // 피자 한 판의 반지름
			double P2 = Double.parseDouble(st.nextToken()); // 피자 한 판의 가격
			double whole = P2 / (R1 * R1 * Math.PI); // 피자 한 판의 단위 면적 당 가격
			sb.append(piece > whole ? "Whole pizza\n" : "Slice of pizza\n"); // 더 작은 값을 가지는 피자를 선택
		}
		System.out.println(sb); // 출력
		br.close();
	}
}