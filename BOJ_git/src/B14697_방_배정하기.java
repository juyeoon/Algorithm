import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 브루트포스로 0부터 A,B,C 각각을 N에서 나눈 값까지 반복하여 순회
// 삼중 for문을 사용하고 가장 안의 for문에서 N에서 세 값을 뺏을 때 0이되면 가능 그 외에는 불가능
public class B14697_방_배정하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // 방 정원 A
		int B = Integer.parseInt(s[1]); // 방 정원 B
		int C = Integer.parseInt(s[2]); // 방 정원 C
		int N = Integer.parseInt(s[3]); // 학생 수
		boolean isposs = false; // 가능 여부 (true: 가능)
		fLoop: for (int a = 0; a <= N / A; a++) { // A방 개수
			for (int b = 0; b <= N / B; b++) { // B방 개수
				for (int c = 0; c <= N / C; c++) { // C방 개수
					if (N - a * A - b * B - c * C == 0) { // 빈 침대 없이 배정이 가능하면
						isposs = true; // 가능
						break fLoop; // 모든 반복문 탈출
					}
				}
			}
		}
		System.out.println(isposs ? 1 : 0); // 출력
		br.readLine();
	}
}