import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력받은 수의 0 중에 끝에 연속된 0이 아닌 0의 개수를 구하는 문제
// 전체 0 개수를 구한 후 끝에 연속된 0 개수를 뺀 것을 출력
public class B27257_Любитель_нулей {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c[] = br.readLine().toCharArray(); // 입력받은 수
		int allZero = 0; // 전체 0 개수
		int lastZero = 0; // 끝에 연속된 0 개수
		for (int i = 0; i < c.length; i++) { // 전체 0 개수 구하기
			if (c[i] == '0') {
				allZero++;
			}
		}
		for (int i = c.length - 1; i >= 0; i--) { // 끝에 연속된 0 개수 구하기
			if (c[i] != '0') {
				break;
			}
			lastZero++;
		}
		System.out.println(allZero - lastZero); // 출력
		br.close();
	}
}