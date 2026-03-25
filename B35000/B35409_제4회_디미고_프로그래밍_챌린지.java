import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 35409 - 제4회 디미고 프로그래밍 챌린지
// https://www.acmicpc.net/problem/35409
public class B35409_제4회_디미고_프로그래밍_챌린지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int time = H * 60 + M;
		boolean possible = inRange(time, 6, 30, 9, 0) 
				|| inRange(time, 9, 50, 10, 0) 
				|| inRange(time, 10, 50, 11, 0)
				|| inRange(time, 11, 50, 12, 0) 
				|| inRange(time, 12, 50, 13, 50) 
				|| inRange(time, 14, 40, 14, 50)
				|| inRange(time, 15, 40, 15, 50) 
				|| inRange(time, 16, 40, 22, 50);
		System.out.println(possible ? "Yes" : "No");
		br.close();
	}

	static boolean inRange(int current, int sh, int sm, int eh, int em) {
		int start = sh * 60 + sm;
		int end = eh * 60 + em;
		return start <= current && current <= end;
	}

}
