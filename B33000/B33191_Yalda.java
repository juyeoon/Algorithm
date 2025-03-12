import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33191
// 수중에 지닌 돈이 주어지고 수박, 석류, 견과류 순서로 선호할 때 살 수 있는 하나의 과일을 선택하는 문제
// 반복문으로 수중에 지닌 돈이 가격 이상이면 해당 식재료를 출력.
// 모두 예산 초과면 Nothing 출력
public class B33191_Yalda {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int b = Integer.parseInt(br.readLine()); // 예산
		String ans = "Nothing"; // 출력문
		String fruits[] = { "Watermelon", "Pomegranates", "Nuts" }; // 각각의 식재료 이름
		for (int i = 0; i < 3; i++) { // 3개 확인
			if (b >= Integer.parseInt(br.readLine())) { // 살 수 있으면
				ans = fruits[i];
				break;
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
