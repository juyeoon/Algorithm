import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 값을 다 더한 후 음수면 Left 양수면 Right 0이면 Stay 출력
public class B28938_Конвейер {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 이동 횟수
		String s[] = br.readLine().split(" ");
		int sum = 0; // 입력값의 합
		for (int i = 0; i < n; i++) { // sum 구하기
			sum += Integer.parseInt(s[i]);
		}
		if (sum > 0) { // 오른쪽
			System.out.println("Right");
		} else if (sum < 0) { // 왼쪽
			System.out.println("Left");
		} else { // 가운데
			System.out.println("Stay");
		}
		br.close();
	}
}