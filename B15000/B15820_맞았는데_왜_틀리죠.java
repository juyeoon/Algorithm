import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 샘플 테스트케이스를 맞았는지 아닌지를 확인하는 변수(boolean)과 시스템 테스트케이스를 맞았는지 아닌지를 확인하는 변수(boolean)로 조건 분기
public class B15820_맞았는데_왜_틀리죠 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		int S1 = Integer.parseInt(st.nextToken()); // 샘플 테스트케이스 개수
		int S2 = Integer.parseInt(st.nextToken()); // 시스템 테스트케이스 개수
		boolean sampleT = true; // 샘플 테스트케이스 맞음 여부(true: 맞음)
		boolean systemT = true; // 시스템 테스트케이스 맞음 여부(true: 맞음)
		for (int i = 0; i < S1; i++) { // 샘플 테스트케이스에 대해 확인
			st = new StringTokenizer(br.readLine().trim());
			if (!st.nextToken().equals(st.nextToken())) { // 다르면
				sampleT = false;
				break; // 반복문 탈출
			}
		}
		for (int i = 0; i < S2; i++) { // 시스템 테스트케이스에 대해 확인
			st = new StringTokenizer(br.readLine().trim()); // 다르면
			if (!st.nextToken().equals(st.nextToken())) {
				systemT = false;
				break; // 반복문 탈출
			}
		}
		// 명시된 조건에 맞게 출력
		if (sampleT && systemT) {
			System.out.println("Accepted");
		} else if (!sampleT) {
			System.out.println("Wrong Answer");
		} else if (sampleT && !systemT) {
			System.out.println("Why Wrong!!!");
		}
		br.close();
	}
}