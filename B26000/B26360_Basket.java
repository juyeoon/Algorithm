import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26360
// X점 슛 시도: 들어가면 X점, 안 들어가면 0점
// 반칙이 있었다면 심판은 결과를 보고 추가 자유투
// 들어간 경우: 추가 자유투 1개(들어가면 +1점)
// 안 들어간 경우: 추가 자유투 X개(각각 들어갈 때마다 +1점)
public class B26360_Basket {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()); // 기본 슛 점수값
		int made = Integer.parseInt(br.readLine()); // 기본 슛 성공 여부
		int foul = Integer.parseInt(br.readLine()); // 반칙 여부
		int total = 0; // 최종 점수 누적
		if (made == 1) { // 기본 슛 점수 반영
			total += X;
		}
		if (foul == 1) { // 반칙이 있었다면 추가 자유투 처리
			if (made == 1) { // 기본 슛이 들어간 경우: 추가 자유투 1개
				int ft = Integer.parseInt(br.readLine());
				if (ft == 1) {
					total += 1;
				}
			} else { // 기본 슛이 실패한 경우: 추가 자유투 X개
				for (int i = 0; i < X; i++) {
					int ft = Integer.parseInt(br.readLine());
					if (ft == 1) {
						total += 1;
					}
				}
			}
		}
		System.out.println(total);
		br.close();
	}
}
