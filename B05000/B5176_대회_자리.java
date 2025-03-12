import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// boolean 배열로 자리에 앉은 사람이 있는지 확인
// boolean 배열의 인덱스 값이 true면 못 앉는 사람 수 +1
public class B5176_대회_자리 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 0; tc < T; tc++) {
			String s[] = br.readLine().split(" ");
			int P = Integer.parseInt(s[0]); // 참가자의 수
			int M = Integer.parseInt(s[1]); // 자리의 수
			boolean seat[] = new boolean[M + 1]; // 사람이 앉았는지 여부 확인 배열
			int cnt = 0; // 못 앉은 사람의 수
			for (int i = 0; i < P; i++) {
				int tmp = Integer.parseInt(br.readLine()); // 자리 위치
				if (seat[tmp]) { // 이미 사림이 있으면
					cnt++; // 못 앉은 사람의 수 갱신
				} else { // 사람이 없으면
					seat[tmp] = true; // 배열 값 갱신
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}