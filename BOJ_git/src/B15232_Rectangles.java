import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이중 for문으로 사각형 별 찍기
public class B15232_Rectangles {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int R = Integer.parseInt(br.readLine()); // 행 수
		int C = Integer.parseInt(br.readLine()); // 열 수

		for (int i = 0; i < R; i++) { // 행 반복
			for (int j = 0; j < C; j++) { // 열 반복
				sb.append("*");
			}
			sb.append("\n"); // 개행
		}
		System.out.println(sb); // 출력
		br.close();
	}
}