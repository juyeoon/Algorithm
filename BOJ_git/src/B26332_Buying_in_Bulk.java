import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 고객의 총 비용 = 원가 가격 - 할인 가격
// = (고객이 구매한 품목 수 * 품목 한 개의 가격) - ((고객이 구매한 품목 수 - 1) * 2) 
public class B26332_Buying_in_Bulk {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 확인할 고객의 수
		for (int tc = 0; tc < T; tc++) {
			String s1 = br.readLine(); // 고객의 정보값
			sb.append(s1).append("\n");
			String s2[] = s1.split(" ");
			int c = Integer.parseInt(s2[0]); // 고객이 구매한 품목 수
			int p = Integer.parseInt(s2[1]); // 품목 한 개의 가격
			sb.append(c * p - (c - 1) * 2).append("\n"); // 고객의 총 비용
		}
		System.out.println(sb); // 출력
		br.close();
	}
}