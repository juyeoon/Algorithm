import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 'O'가 입력되면 기본 점수(i+1) + 보너스 점수를 전체 점수에 더하고 보너스 점수 1 증가
// 'X'가 입력되면 보너스 점수 0으로 갱신
public class B17389_보너스_점수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 문제 개수
		String s = br.readLine(); // 입력 OX표
		int bonus = 0; // 보너스 점수
		int sum = 0; // 총 점
		for (int i = 0; i < N; i++) {
			if (s.charAt(i) == 'X') { // 문제를 틀리면
				bonus = 0; // 보너스 점수 리셋
			} else { // 문제를 맞히면
				sum += i + 1; // 기본 점수
				sum += bonus++; // 보너스 점수
			}
		}
		System.out.println(sum); // 출력
		br.close();
	}
}