import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 식으로 P를 구하고 출력한 뒤 P의 값에 따라 -1, 0, 1 출력
public class B21612_Boiling_Water {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine()) * 5 - 400; // 물이 끓기 시작하는 온도
		System.out.println(P); // P 출력
		if (P == 100) { // P가 100이면 해수면
			System.out.println(0);
		} else if (P > 100) { // P가 100보다 크면 해수면 아래
			System.out.println(-1);
		} else { // P가 100보다 작으면 해수면 위
			System.out.println(1);
		}
		br.close();
	}
}