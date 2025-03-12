import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 각 입력 줄의 문자열의 길이를 출력하는 문제
public class B5340_Secret_Location {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String op[] = { "Latitude", "Longitude" }; // 각 줄의 출력 형식
		for (int i = 0; i < 2; i++) { // 행
			sb.append(op[i]).append(" "); // 출력 형식 맞추기
			for (int j = 0; j < 2; j++) { // 처음 2줄 길이 출력
				sb.append(br.readLine().trim().length()).append(":");
			}
			sb.append(br.readLine().trim().length()).append("\n"); // 세 번째 줄 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}