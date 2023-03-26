import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 모서리를 직사각형으로 잘랐을 때의 자른 면의 길이가 모서리를 대각선으로 잘랐을 때의 자른 면의 길이가 얼마나 더 짧은지 구하는 문제
// 모서리를 직사각형으로 잘랐을 때의 자른 면의 길이 = w + h
// 모서리를 대각선으로 잘랐을 때의 자른 면의 길이 = sqrt(w*w + h*h) [피타고라스의 정리]
public class B20215_Cutting_Corners {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int w = Integer.parseInt(s[0]); // 모서리를 자를 때 직사각형의 가로 길이
		int h = Integer.parseInt(s[1]); // 모서리를 자를 때 직사각형의 세로 길이
		System.out.println(String.format("%.9f", (w + h) - (Math.sqrt(w * w + h * h)))); // 출력
		br.close();
	}
}