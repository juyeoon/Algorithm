import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34281
// 가로 세로가 주어졌을 때 넓이를 구하는 문제
public class B34281_Class_Photo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long w = Long.parseLong(br.readLine());
		long l = Long.parseLong(br.readLine());
		System.out.println(w * l);
		br.close();
	}
}
