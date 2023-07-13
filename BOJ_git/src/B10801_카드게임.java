import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 각 라운드마다 숫자 비교 후 A와 B가 이긴 횟수 저장. 이긴 횟수 비교로 결과 출력
public class B10801_카드게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A[] = br.readLine().split(" "); // A가 제시한 카드
		String B[] = br.readLine().split(" "); // B가 제시한 카드
		int Awin = 0; // A가 이긴 횟수
		int Bwin = 0; // B가 이긴 횟수
		for (int i = 0; i < 10; i++) { // 10라운드 진행
			int a = Integer.parseInt(A[i]); // 라운드에서 A가 제시한 숫자
			int b = Integer.parseInt(B[i]); // 라운드에서 B가 제시한 숫자
			if (a > b) { // A가 크면
				Awin++;
			} else if (a < b) { // B가 크면
				Bwin++;
			}
		}
		if (Awin == Bwin) { // A와 B가 이긴 횟수가 같으면
			System.out.println('D'); // 비김 출력
		} else { // 이긴 횟수가 다르면
			System.out.println(Awin > Bwin ? 'A' : 'B'); // 이긴 사람 출력
		}
		br.close();
	}
}