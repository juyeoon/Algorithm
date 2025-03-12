import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Arrays.sort 사용
public class B2752_세수정렬 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n[] = new int[3];
		for (int i = 0; i < 3; i++) { // input n[]
			n[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(n); // 오름차순 정렬
		System.out.printf("%d %d %d",n[0], n[1], n[2]); // 출력
		br.close();
	}
}
