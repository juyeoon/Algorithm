import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 수들의 순서를 뒤집어서 출력하는 문제
public class B30658_Os_ultimos_serao_os_primeiros {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine().trim()).equals("0")) { // EOI
			int n = Integer.parseInt(s); // 수 개수
			int num[] = new int[n]; // 수 배열
			for (int i = 0; i < n; i++) { // num[] 채우기
				num[i] = Integer.parseInt(br.readLine().trim());
			}
			for (int i = n - 1; i >= 0; i--) { // 역순으로 출력
				sb.append(num[i]).append("\n");
			}
			sb.append("0\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}