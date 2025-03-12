import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14467
// 소의 번호에 대해 위치를 저장하고 저장 위치가 입력 위치가 다르면 카운트후 저장 위치 갱신
public class B14467_소가_길을_건너간_이유_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 관찰 횟수
		int cowloc[] = new int[11]; // 소의 현재 위치
		for (int i = 1; i <= 10; i++) { // 초기화
			cowloc[i] = -1;
		}
		int cnt = 0; // 소가 길 건넌 횟수
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken()); // 소 번호
			int loc = Integer.parseInt(st.nextToken()); // 소 위치
			if (cowloc[num] == -1) { // 소가 처음 등장했을 때
				cowloc[num] = loc; // 위치 설정
			} else if (cowloc[num] != loc) { // 입력 받은 위치와 다른 위치일 때 이동
				cnt++;
				cowloc[num] = loc;
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}