import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가장 큰 부피 = (가로 = (n - v, v 중 최댓값)) * (세로 = (n - h, h 중 최댓값)) * (높이 = 4)
public class B17874_Piece_of_Cake느낌표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]); // 가로, 세로 길이
		int h = Integer.parseInt(s[1]); // 나눠진 세로 길이 중 하나
		int v = Integer.parseInt(s[2]); // 나눠진 가로 길이 중 하나
		System.out.println(Math.max(n - h, h) * Math.max(n - v, v) * 4); // 가장 큰 부피 출력
		br.close();
	}
}