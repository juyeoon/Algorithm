import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 각 과목의 점수를 입력 받고 점수를 비교한 후 계산한 값을 더하고 그 값에 우편번호를 곱한 값 출력
public class B29807_학번을_찾아줘 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 응시 과목 수
		String s[] = br.readLine().split(" ");
		int score[] = new int[5]; // 성적
		for (int i = 0; i < T; i++) { // score[] 채우기
			score[i] = Integer.parseInt(s[i]);
		}
		int sum = 0; // 계산한 값의 합
		if (score[0] > score[2]) { // 국어 점수 영어 점수 비교
			sum += (score[0] - score[2]) * 508;
		} else {
			sum += (score[2] - score[0]) * 108;
		}
		if (score[1] > score[3]) { // 수학 점수 탐구 점수 비교
			sum += (score[1] - score[3]) * 212;
		} else {
			sum += (score[3] - score[1]) * 305;
		}
		sum += score[4] * 707; // 제2외국어 점수 계산
		System.out.println(sum * 4763); // 학번 출력
		br.close();
	}
}