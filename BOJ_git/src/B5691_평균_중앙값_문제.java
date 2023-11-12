import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 중앙값과 평균이 같으려면 세 수를 크기대로 나열했을 때 두번째 수가 평균이 되어야 하며 
// 두번째 수가 평균이 되려면 두번째 수와 각각의 다른 수와의 차가 같아야 함
// 가장 작은 C는 C A B 순서로 나열되어야 하며 |A-B|와 |C-A|가 같아야 함
public class B5691_평균_중앙값_문제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) { // EOI
			st = new StringTokenizer(s);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A - (B - A)).append("\n"); // C
		}
		System.out.println(sb); // 출력
		br.close();
	}
}