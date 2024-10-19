import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 초-분-시 순서로 빌림을 고려하여 계산
// 적어도 1초이기 때문에 결과가 00:00:00이면 24시간
public class B13223_소금_폭탄 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String now[] = br.readLine().split(":"); // 현재 시각
		String na[] = br.readLine().split(":"); // 나트륨 뿌릴 시각
		int ansHH = Integer.parseInt(na[0]) - Integer.parseInt(now[0]); // 시
		int ansMM = Integer.parseInt(na[1]) - Integer.parseInt(now[1]); // 분
		int ansSS = Integer.parseInt(na[2]) - Integer.parseInt(now[2]); // 초
		if (ansSS < 0) { // 초 계산(빌림)
			ansMM--;
			ansSS += 60;
		}
		if (ansMM < 0) { // 분 계산(빌림)
			ansHH--;
			ansMM += 60;
		}
		if (ansHH < 0) { // 시 계산(빌림)
			ansHH += 24;
		}
		if (ansHH == 0 && ansMM == 0 && ansSS == 0) { // 00:00:00이면 24:00:00으로 변경
			ansHH = 24;
		}
		System.out.println(String.format("%02d:%02d:%02d", ansHH, ansMM, ansSS)); // 형식에 맞게 출력
		br.readLine();
	}
}
