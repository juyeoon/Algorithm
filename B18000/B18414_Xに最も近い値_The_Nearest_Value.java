import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// L 이상 R 이하의 정수 중 X와의 차이가 가장 적은 수 구하기
// X가 L과 R 사이에 있는지 없는지에 따라서 경우를 나눔
public class B18414_Xに最も近い値_The_Nearest_Value {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int X = Integer.parseInt(s[0]);
		int L = Integer.parseInt(s[1]);
		int R = Integer.parseInt(s[2]);
		if (L <= X && X <= R) { // X가 L과 R 사이에 있을 때
			System.out.println(X);
		} else { // X가 L과 R 사이를 벗어낫을 때
			int LX = Math.abs(L - X); // L과의 거리
			int RX = Math.abs(R - X); // R과의 거리
			System.out.println((LX > RX) ? R : L); // 더 작은 쪽 출력
		}
		br.close();
	}
}