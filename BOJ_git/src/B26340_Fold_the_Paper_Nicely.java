import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 직사각형의 가로 세로와 접은 횟수가 주어지고 가로 세로 중 긴 변을 접을 때, 접은 횟수만큼 접고 난 후의 직사각형의 변의 길이를 출력하는 문제
// 두 변의 길이 중 큰 길이를 /2하는 작업을 접은 횟수만큼 반복
public class B26340_Fold_the_Paper_Nicely {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine().trim()); // 데이터 세트 수
		for (int tc = 0; tc < n; tc++) {
			String s = br.readLine();
			sb.append("Data set: ").append(s).append("\n");
			st = new StringTokenizer(s, " ");
			int width = Integer.parseInt(st.nextToken()); // 직사각형 한 변
			int height = Integer.parseInt(st.nextToken()); // 직사각형 다른 한 변
			int cnt = Integer.parseInt(st.nextToken()); // 접은 횟수
			for (int i = 0; i < cnt; i++) { // 접은 횟수만큼 긴 변 접기
				if (width > height) {
					width /= 2;
				} else {
					height /= 2;
				}
			}
			sb.append(width > height ? (width + " " + height) : (height + " " + width)).append("\n\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}