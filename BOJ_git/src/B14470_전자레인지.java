import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 고기가 얼어있고 온도가 0℃ 미만일 때 고기를 0℃ 로 올리는 시간과
// 고기가 얼어있고 0℃ 일 때 해동하는 시간과
// 고기를 A(or 0)℃ 에서 B℃ 까지 데우는 시간을 합한 시간의 합 출력
public class B14470_전자레인지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine()); // 원래의 고기의 온도
		int B = Integer.parseInt(br.readLine()); // 목표 온도
		int C = Integer.parseInt(br.readLine()); // 얼어 있는 고기를 1℃ 데우는 데 걸리는 시간
		int D = Integer.parseInt(br.readLine()); // 얼어 있는 고기를 해동하는 데 걸리는 시간
		int E = Integer.parseInt(br.readLine()); // 얼어 있지 않은 고기를 1℃ 데우는 데 걸리는 시간
		int time = 0; // 고기를 B℃로 데우는 데 걸리는 시간
		if (A < 0) { // 고기가 0℃ 미만일 때
			time += -1 * A * C; // 고기를 0℃까지 올리는 시간 추가
			A = 0; // 고기를 0℃로
		}
		if (A == 0) { // 고기가 얼어있고 0℃ 일 때
			time += D; // 해동하는 시간 추가
		}
		time += (B - A) * E; // 고기를 A℃ 에서 B℃ 까지 데우는 시간 추가
		System.out.println(time); // 시간 출력
		br.close();
	}
}
