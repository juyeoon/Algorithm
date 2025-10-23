import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/13363
// 두 각도 사이를 −180~179 범위로 맞춰 가장 짧은 회전 각도 찾기
public class B13363_Jumbled_Compass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(br.readLine()); // 현재 각도
		int n2 = Integer.parseInt(br.readLine()); // 목표 각도
		int diff = (n2 - n1 + 540) % 360 - 180; // -180 ~ 179 범위로 정규화
		if (diff == -180) {
			diff = 180;
		}
		System.out.println(diff); // 출력
		br.close();
	}
}
