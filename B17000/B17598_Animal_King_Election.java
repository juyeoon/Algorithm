import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17598
// 입력 문자열 9개 중에 "Lion"이 많은지 "Tiger"가 많은지 확인하는 문제
// 각각 등장횟수를 센 후 비교
public class B17598_Animal_King_Election {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lion = 0; // Lion 등장 횟수
		int tiger = 0; // Tiger 등장 횟수
		for (int i = 0; i < 9; i++) { // 9번
			if (br.readLine().equals("Lion")) { // Lion
				lion++;
			} else { // Tiger
				tiger++;
			}
		}
		System.out.println(lion > tiger ? "Lion" : "Tiger"); // 출력
		br.close();
	}
}
