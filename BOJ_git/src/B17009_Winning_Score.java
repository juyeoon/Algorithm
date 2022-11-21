import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복문으로 사과와 바나나의 총점을 구한 후 총점을 비교
public class B17009_Winning_Score {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = 0; // 사과의 총점
		for (int i = 3; i >= 1; i--) { // 사과 총점 구하기
			A += Integer.parseInt(br.readLine()) * i;
		}
		int B = 0; // 바나나의 총점
		for (int i = 3; i >= 1; i--) { // 바나나 총점 구하기
			B += Integer.parseInt(br.readLine()) * i;
		}
		if (A > B) { // A가 더 클 때
			System.out.println("A");
		} else if (A < B) { // B가 더 클 때
			System.out.println("B");
		} else { // Tie일 때
			System.out.println("T");
		}
		br.close();
	}
}