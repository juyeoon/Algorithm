import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 각 라운드가 끝날 때마다 점수차를 확인한 후 2점 차가 되면 경기를 멈추가 그때의 점수 출력
public class B27918_탁구_경기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 경기의 수
		int D = 0; // 달구의 점수
		int P = 0; // 포닉스의 점수
		for (int i = 0; i < N; i++) { // 라운드 수만큼 반복
			if (br.readLine().equals("D")) { // 달구가 이겼을 때
				D++;
			} else { // 포닉스가 이겼을 때
				P++;
			}
			if (D - P == -2 || D - P == 2) { // 점수가 2점차면
				break; // 반복문 멈춤
			}
		}
		System.out.println(D + ":" + P); // 점수 출력
	}
}