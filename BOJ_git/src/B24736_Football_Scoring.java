import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 각 숫자마다의 배점을 저장하여 곱하기
public class B24736_Football_Scoring {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] score = { 6, 3, 2, 1, 2 }; // 각 숫자마다의 배점
		for (int i = 0; i < 2; i++) { // 입력 2줄 반복
			int sum = 0; // 점수 합
			String[] s = br.readLine().split(" ");
			for (int j = 0; j < 5; j++) {
				sum += score[j] * Integer.parseInt(s[j]); // 배점 * 점수를 합에 더하기
			}
			System.out.print(sum + " "); // 점수 합 출력
		}
	}
}
