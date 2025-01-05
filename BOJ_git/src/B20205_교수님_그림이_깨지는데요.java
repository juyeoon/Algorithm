import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/20205
// 원래의 이미지 픽셀 정보를 입력 받아 확장 이미지의 한 행의 정보를 구하고 저장
// 확장 이미지의 한 행의 정보를 확장 배수만큼 복사
// 를 원래의 이미지 픽셀 정보 한 행씩 반복
public class B20205_교수님_그림이_깨지는데요 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 확장 픽셀
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 원 이미지의 픽셀 정보
		int K = Integer.parseInt(st.nextToken()); // 확장 배수
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			StringBuilder tmpSb = new StringBuilder(); // 확장된 픽셀 (한 행)
			for (int j = 0; j < N; j++) { // 확장된 픽셀 구하기 (한 행)
				int pixel = Integer.parseInt(st.nextToken());
				for (int l = 0; l < K; l++) {
					tmpSb.append(pixel).append(" ");
				}
			}
			for (int l = 0; l < K; l++) { // 확장된 픽셀 (열 복사)
				sb.append(tmpSb.toString()).append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
