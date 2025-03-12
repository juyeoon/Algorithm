import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// B >= C일 때, N > A / (B-C)
public class B1712_손익분기점 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // 고정비용
		int B = Integer.parseInt(s[1]); // 가변 비용
		int C = Integer.parseInt(s[2]); // 노트북 한 대 가격
		System.out.print((B >= C) ? -1 : A / (C - B) + 1); // 손익분기점
		br.close();
	}
}
