import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소스 이미지의 픽셀과 반전된 이미지의 픽셀이 주어졌을 때 잘못 반전된 픽셀의 총 개수를 구하는 문제
// 소스 이미지와 반전된 이미지의 같은 자리의 문자가 같으면 잘못 반전된 픽셀
public class B21665_Миша_и_негатив {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 세로 픽셀 수
		int M = Integer.parseInt(s[1]); // 가로 픽셀 수
		char[][] pixels = new char[N][M]; // 소스 이미지의 픽셀 정보
		int cnt = 0; // 반전이 잘못된 픽셀의 개수
		for (int i = 0; i < N; i++) { // pixels[][] 채우기
			String tmp = br.readLine();
			for (int j = 0; j < M; j++) {
				pixels[i][j] = tmp.charAt(j);
			}
		}
		br.readLine();
		for (int i = 0; i < N; i++) { // 반전이 잘못된 픽셀 개수 세기
			String tmp = br.readLine();
			for (int j = 0; j < M; j++) {
				if ((tmp.charAt(j) == 'W' && pixels[i][j] == 'W') || (tmp.charAt(j) == 'B' && pixels[i][j] == 'B')) {
					cnt++;
				}
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}