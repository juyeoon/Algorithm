import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 다솜이 매수한 표를 합친 값이 다른 후보들의 득표수의 최대값보다 커야 한다.
public class B1417_국회의원_선거 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 후보 수
		int max = Integer.MIN_VALUE; // 다른 후보들의 득표수의 최댓값
		int voteNum[] = new int[N]; // 후보들의 득표수
		voteNum[0] = Integer.parseInt(br.readLine());
		for (int i = 1; i < N; i++) { // input
			voteNum[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, voteNum[i]);
		}
		int somOrigin = voteNum[0]; // 다솜이 원래 받았던 득표수
		Loop: while (voteNum[0] <= max) { // 다솜의 득표수 + 매수표가 다른 후보들의 득표수의 최댓값보다 작을 때 반복
			for (int i = 1; i < N; i++) { // 2번 후보자부터 확인
				if (voteNum[i] == max) { // 득표수가 최대값과 같을때
					--voteNum[i]; // 하나 빼서
					++voteNum[0]; // 다솜한테 주기
				}
				// 최댓값은 변화 없음(뒤에 최댓값과 같은 사람 존재 할 수 있음)
				if (voteNum[0] > max) { // 최댓값보다 다솜의 값이 커지면
					break Loop; // while문 탈출
				}
			}
			--max; // 최댓값과 같은 모든 후보를 하나씩 빼면 최댓값-1
		}
		System.out.println(voteNum[0] - somOrigin); // 다솜의 조작 득표수 - 다솜의 원래 득표수 = 매수수 
		br.close();
	}

}
