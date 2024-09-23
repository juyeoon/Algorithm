import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 트리 암페어보다 어댑터 암페어(어댑터 와트 / 어댑터 볼트)가 크거나 같으면 가능(1 출력)
public class B32314_Christmas_Tree_Adapter {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine()); // 트리 암페어
		String s[] = br.readLine().split(" ");
		int w = Integer.parseInt(s[0]); // 어댑터 와트
		int v = Integer.parseInt(s[1]); // 어댑터 볼트
		if (w / v >= a) { // 트리 암페어보다 어댑터 암페어가 크거나 같으면 가능
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		br.close();
	}
}