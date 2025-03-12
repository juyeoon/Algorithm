import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 삼각형의 면적과 밑변의 길이가 주어졌을 때 삼각형의 높이를 구하는 문제
// 삼각형의 높이 = 면적  * 2 / 밑변의 길이
// 소수점 둘째 자리까지 반올림 필요
public class B26592_Triangle_Height {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 줄 수
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			double area = Double.parseDouble(st.nextToken()); // 면적
			double base = Double.parseDouble(st.nextToken()); // 밑변의 길이
			sb.append("The height of the triangle is ").append(String.format("%.2f", area * 2 / base))
					.append(" units\n"); // 포맷에 맞게 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}