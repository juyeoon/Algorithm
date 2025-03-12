import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가운데를 중심으로 좌우가 서로 달라야 함
// 가운데를 중심으로 좌우로 부분을 나눴을 때 그 부분도 부분의 가운데를 중심으로 좌우가 서로 달라야 함
public class B1802_종이_접기 {
	public static boolean io[]; // 0: true(in), 1: false(out)
	public static int ex; // s의 길이가 2^ex-1 (재귀의 기저로 사용)

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			String s = br.readLine(); // 종이의 정보
			int N = s.length(); // 문자열 길이
			if (N == 1) { // 길이가 1이면 무조건 YES
				sb.append("YES\n");
				continue;
			}
			io = new boolean[N]; // 종이의 정보 배열
			for (int i = 0; i < N; i++) { // input io // 0: true(in), 1: false(out)
				io[i] = s.charAt(i) == '0' ? true : false;
			}
			// ex(s의 길이가 2^ex-1) 구하기
			int temp = N + 1;
			ex = 0;
			while (temp != 1) {
				ex++;
				temp = temp >> 1;
			}
			// 접기가 가능한지 불가능한지 확인
			sb.append(half(0, N - 1, 1) ? "YES\n" : "NO\n");
		}
		System.out.println(sb); // 정답 출력
		br.close();
	}

	// 부분의 가운데를 중심으로 좌우가 반대인지 확인(반대: true, 반대X: false)
	// start: 배열의 시작 인덱스, end: 배열의 마지막 인덱스, cnt: 호출 횟수(ex-1까지만 해야 함)
	public static boolean half(int start, int end, int cnt) {
		// 기저 조건 - 기저 조건까지 갔으면 앞에서 안 걸러졌기 때문에 무조건 true
		if (cnt == ex) {
			return true;
		}
		int center = (start + end) / 2; // 부분의 중앙(0인지 1인지 상관 없음)
		int idxF = center - 1; // 확인할 인덱스(좌)
		int idxB = center + 1; // 확인할 인덱스(우)
		while (idxF >= start) { // start까지 idxF를 줄이기
			if (io[idxF] == io[idxB]) { // 좌우가 같으면
				return false; // false 반환
			}
			idxF--; // 좌 인덱스 --
			idxB++; // 우 인덱스 ++
		}
		// 여기까지 내려오면 좌우가 반대(true)
		if (half(idxF + 1, center - 1, cnt + 1)) { // 좌 부분 재귀
			return true;
		}
		if (half(center + 1, idxB - 1, cnt + 1)) { // 우 부분 재귀
			return true;
		}
		return false;
	}

}
