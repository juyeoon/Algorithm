import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B4153_직각삼각형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while (!((str = br.readLine()).equals("0 0 0"))) { // 마지막 줄까지
			String s[] = str.split(" ");
			int n[] = new int[3];
			for (int i = 0; i < 3; i++) {
				n[i] = Integer.parseInt(s[i]);
			} // input
			Arrays.sort(n); // 정렬 -> n[2]가 빗변
			System.out.println((Math.pow(n[0], 2) + Math.pow(n[1], 2) == Math.pow(n[2], 2) ? "right" : "wrong")); // 피타고라스 정리																													
		}
		br.close();
	}
}
