import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메뉴 개수만큼의 크기의 배열에 가격을 저장한 후 새내기들이 먹고 싶어하는 메뉴 번호에 해당하는 메뉴의 가격을 모두 더한 총 합 출력
public class B31821_학식_사주기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 메뉴 개수
		int price[] = new int[N + 1]; // 가격
		for (int i = 1; i <= N; i++) { // price[] 채우기
			price[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0; // 가격 총 합
		int M = Integer.parseInt(br.readLine()); // 새내기 수
		for (int i = 0; i < M; i++) { // 새내기들이 먹고 싶어하는 메뉴의 가격의 합 구하기
			sum += price[Integer.parseInt(br.readLine())];
		}
		System.out.println(sum); // 출력
		br.close();
	}
}