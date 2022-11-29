import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 조건에 맞게 if-else문 작성
public class B16017_Telemarketer_or_not물음표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean isAnswer = false; // true: "answer" 출력
		if (Integer.parseInt(br.readLine()) < 8) { // 첫 번째 숫자가 8 또는 9가 아니면
			isAnswer = true; // "answer"
		} else {
			if (Integer.parseInt(br.readLine()) != Integer.parseInt(br.readLine())) { // 두 번째 숫자가 같지 않으면
				isAnswer = true; // "answer"
			} else {
				if (Integer.parseInt(br.readLine()) < 8) { // 세 번째 숫자가 8 또는 9가 아니면
					isAnswer = true; // "answer"
				}
			}
		}
		System.out.println(isAnswer ? "answer" : "ignore"); // 출력
		br.close();
	}
}