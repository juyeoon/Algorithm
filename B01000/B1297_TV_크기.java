import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대각선의 길이로 실제 TV 크기를 구하기 위한 배수를 구한 뒤 높이 비율과 너비 비율에 곱하기
public class B1297_TV_크기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int D = Integer.parseInt(s[0]); // 대각선 길이
		int H = Integer.parseInt(s[1]); // TV의 높이 비율
		int W = Integer.parseInt(s[2]); // TV의 너비 비율
		double a = Math.sqrt((double) (D * D) / (H * H + W * W)); // 실제 TV 크기를 구하기 위한 배수 a
		System.out.print((int) (a * H) + " " + (int) (a * W));
	}
}