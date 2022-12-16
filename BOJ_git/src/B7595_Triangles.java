import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별찍기 문제
// 이중 for문을 사용하여 1개 ~ n개의 별 찍기
public class B7595_Triangles {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // 0이 입력되면 끝
			int n = Integer.parseInt(s); // 줄 개수
			for (int i = 0; i < n; i++) { // 별 찍기(행)
				for (int j = 0; j <= i; j++) { // 별 찍기(열)
					sb.append("*");
				}
				sb.append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}