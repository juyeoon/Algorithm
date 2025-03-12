import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 각 등수의 정답수와 패널티를 각각 배열에 저장 후 등수를 인덱스로 값 출력
public class B31429_SUAPC_2023_Summer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 등수
		int correct[] = { 0, 12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6 }; // 맞힌 문제 수
		int penalty[] = { 0, 1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773 }; // 패널티
		System.out.println(correct[N] + " " + penalty[N]); // 출력
		br.close();
	}
}