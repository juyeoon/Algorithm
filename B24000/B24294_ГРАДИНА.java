import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 좌우위아래 + 네 모서리 타일 개수를 구하고
// w1와 w2가 같지 않으면 두 사각형이 만나는 부분 옆 변의 타일 개수 추가
public class B24294_ГРАДИНА {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w1 = Integer.parseInt(br.readLine()); // 직사각형 1의 너비
		int h1 = Integer.parseInt(br.readLine()); // 직사각형 1의 높이
		int w2 = Integer.parseInt(br.readLine()); // 직사각형 2의 너비
		int h2 = Integer.parseInt(br.readLine()); // 직사각형 2의 높이
		int sum = (h1 + h2) * 2 + w1 + w2 + 4; // 좌우위아래 + 네 모서리 타일 개수
		if (w1 != w2) { // w1와 w2가 같지 않으면
			sum += Math.abs(w1 - w2); // 두 사각형이 만나는 부분 옆 변의 타일 개수 추가
		}
		System.out.println(sum); // 출력
		br.close();
	}
}