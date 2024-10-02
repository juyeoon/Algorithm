import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 A와 겹치는 문자열이 P 뿐인 문자열 중 아무거나 하나를 출력하는 문제이므로 그냥 P를 출력하면 됨
public class B21553_암호_만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String P = br.readLine();
		System.out.println(P); // P 출력
		br.close();
	}
}