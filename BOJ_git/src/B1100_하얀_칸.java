import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (0,0)이 하얀 칸이므로 행이 짝수행이면 짝수열 체크, 홀수행이면 홀수칸 체크하여 F개수 카운트
public class B1100_하얀_칸 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0; // F 개수(말 개수)
		for (int i = 0; i < 8; i++) { // 행 반복
			String s = br.readLine(); // 한 행
			int j = (i % 2 == 0) ? 0 : 1; // 행이 짝수행이면 짝수열 체크, 홀수행이면 홀수칸 체크
			while (j < 8) { // 열 반복
				if (s.charAt(j) == 'F') { // 말이 있으면
					cnt++; // 카운트
				}
				j += 2; // 2칸씩 확인
			}
		}
		System.out.println(cnt); // 개수 출력
		br.close();
	}
}