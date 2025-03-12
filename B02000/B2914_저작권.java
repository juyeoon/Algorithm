import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 저작권이 있는 멜로디의 최소 개수 출력(올림 성질)
public class B2914_저작권 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // 앨범에 수록된 곡의 개수
		int I = Integer.parseInt(s[1]); // 평균값
		System.out.println(A * (I - 1) + 1); // 저작권이 있는 멜로디 개수
	}
}
