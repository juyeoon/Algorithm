import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 현재 머리 수를 저장하는 변수를 두고 'c'가 입력되면 머리 수를 1만큼 더하고 'b'가 입력되면 머리 수를 1만큼 빼기
public class B10205_헤라클레스와_히드라 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()); // 데이터 세트 수
		for (int tc = 1; tc <= K; tc++) { // 데이터 세트
			sb.append("Data Set ").append(tc).append(":\n"); // 출력 형식
			int head = Integer.parseInt(br.readLine()); // 현재 머리 수
			char c[] = br.readLine().toCharArray(); // 행동
			for (int i = 0; i < c.length; i++) { // 행동 수 만큼 반복
				if (c[i] == 'c') { // 불로 지지지 않고 머리만 잘랐을 때
					head++; // 머리 수 + 1
				} else { // 머리를 자르고 불로 지졌을 때
					head--; // 머리 수 - 1
				}
			}
			sb.append(head).append("\n\n"); // 행동이 끝난 뒤 머리 수 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
