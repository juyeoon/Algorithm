import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 시작 시각과 종료 시각을 초로 바꾼 후, 종료 시각 초가 더 작으면 24(시) * 3600 - 시작 시각 + 종료 시각으로 계산
// 그 외의 경우에는 종료 시각 초 - 시작 시각 초
public class B15080_Every_Second_Counts {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().replaceAll(" ", "").split(":");
		// 시작 시각 초
		int start = Integer.parseInt(s[0]) * 60 * 60 + Integer.parseInt(s[1]) * 60 + Integer.parseInt(s[2]);
		String e[] = br.readLine().replaceAll(" ", "").split(":");
		// 종료 시각 초
		int end = Integer.parseInt(e[0]) * 60 * 60 + Integer.parseInt(e[1]) * 60 + Integer.parseInt(e[2]);
		if (end < start) { // 종료 시각 초가 더 작으면
			System.out.println(24 * 3600 - start + end); // 24(시) * 3600 - 시작 시각 초 + 종료 시각 초로 계산
		} else {
			System.out.println(end - start); // 종료 시각 초 - 시작 시각 초 출력
		}
		br.close();
	}
}