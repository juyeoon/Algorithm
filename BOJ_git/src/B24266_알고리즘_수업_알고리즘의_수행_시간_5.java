import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//코드 1의 수행 횟수는 n번 반복하는 반복문이 3개 중첩이기 때문에 N^3
//시간복잡도는 O(n^3)이므로 두 번째 줄에 3 출력
public class B24266_알고리즘_수업_알고리즘의_수행_시간_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		System.out.println(N * N * N); // 수행 횟수
		System.out.println(3); // 차수
		br.readLine();
	}
}
