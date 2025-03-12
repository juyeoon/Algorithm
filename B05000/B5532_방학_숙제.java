import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 전체 날짜에서 국어 푸는 날과 수학 푸는 날 중 최댓값을 뺌
// 국어 푸는 기간 => (국어 숙제량 / 1일 최대 풀이 가능량)을 올림
// 수학 푸는 기간 => (수학 숙제량 / 1일 최대 풀이 가능량)을 올림
public class B5532_방학_숙제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = new int[5]; // L A B C D
		for (int i = 0; i < 5; i++) { // input
			input[i] = Integer.parseInt(br.readLine());
		}
		double kor = Math.ceil((double)input[1]/input[3]); // 국어 푸는 기간
		double math = Math.ceil((double)input[2]/input[4]); // 수학 푸는 기간
		// 놀 수 있는 기간 = 전체 날짜 -국어 푸는 날과 수학 푸는 날 중 최댓값
		System.out.println(input[0]-(int)(Math.max(kor, math)));
		br.close();
	}
}
