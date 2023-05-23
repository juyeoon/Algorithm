import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최대 점수를 배열에 저장 후 참가자의 점수를 입력 받아 비교 후 결과에 따라 출력
public class B21866_추첨을_통해_커피를_받자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxScore[] = { 100, 100, 200, 200, 300, 300, 400, 400, 500 }; // 문제 당 최대 점수
		boolean isHacker = false; // 해커 체크
		int sum = 0; // 참가자 점수 합계
		String s[] = br.readLine().split(" "); // 참가자 점수 배열
		for (int i = 0; i < 9; i++) {
			int score = Integer.parseInt(s[i]); // 문제의 참가자 점수
			if (score > maxScore[i]) { // 해커 확인
				isHacker = true;
				break;
			}
			sum += score; // 합계 추가
		}
		if (isHacker) { // 해커인 경우
			System.out.println("hacker");
		} else if (sum < 100) { // 커피 추첨 대상자 아님
			System.out.println("none");
		} else { // 그 외의 경우
			System.out.println("draw");
		}
		br.close();
	}
}