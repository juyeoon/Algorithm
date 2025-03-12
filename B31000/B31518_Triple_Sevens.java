import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 777이 나올 수 있는지 확인하는 문제
// 세 바퀴에 7이 있는지 여부를 [3]크기의 boolean 배열에 저장한 후
// 배열의 하나라도 false이면 0 출력. 전부 true면 777 출력
public class B31518_Triple_Sevens {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 한 바퀴에 나올 수 있는 수의 개수
		boolean seven[] = new boolean[3]; // 세 바퀴에 7이 있는지 여부 (true: 7이 있음)
		for (int i = 0; i < 3; i++) { // 세 바퀴 반복
			String s[] = br.readLine().split(" ");
			for (int j = 0; j < N; j++) { // 한 바퀴에 나올 수 있는 개수 만큼 반복
				if (Integer.parseInt(s[j]) == 7) { // 7이 있으면
					seven[i] = true;
					break; // 반복문 탈출
				}
			}
		}
		// 세 바퀴 전부 7이 있으면 777 출력. 아니면 0 출력
		System.out.println(seven[0] && seven[1] && seven[2] ? 777 : 0);
		br.close();
	}
}