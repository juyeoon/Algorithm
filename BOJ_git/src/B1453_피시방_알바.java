import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 자리 유무를 저장하는 배열 사용(boolean 타입)
public class B1453_피시방_알바 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean num[] = new boolean[101]; // 자리 유무 저장(true: 자리 없음)
		int N = Integer.parseInt(br.readLine()); // 사람 수
		String s[] = br.readLine().split(" ");
		int cnt = 0; // 거절 당한 사람 수
		for (int i = 0; i < N; i++) {
			int idx = Integer.parseInt(s[i]); // 손님 번호
			if (num[idx]) { // 자리가 없으면
				cnt++; // 거절 당한 사람 수 ++
				continue;
			}
			num[idx] = true; // 자리가 있으면 자리 채우기
		}
		System.out.println(cnt); // 거절 당한 사람 수 출력
		br.close();
	}
}